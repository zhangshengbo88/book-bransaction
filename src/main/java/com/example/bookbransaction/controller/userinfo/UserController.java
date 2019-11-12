package com.example.bookbransaction.controller.userinfo;

import com.alibaba.fastjson.JSON;
import com.example.bookbransaction.entity.User;
import com.example.bookbransaction.model.base.Result;
import com.example.bookbransaction.service.userinfo.UserService;
import com.example.bookbransaction.utils.UserUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

@RestController
@RequestMapping("user")
public class UserController {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);
    @Resource
    private UserService userService;
    @RequestMapping(value ="login",method = {RequestMethod.POST})
    public String login(@RequestBody User user, HttpServletRequest request) {
        String password = user.getPassWard();
        String userName = user.getUserName();
        if(userIsEmpty(user)){
            log.error("用户或密码为空");
            return JSON.toJSONString(Result.fail("用户或密码为空"));
        }
        /*Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(userName,password);*/
        try {
            user = userService.findByUserName(userName);
            if(user == null || !password.equals(user.getPassWard()) || !userName.equals(user.getUserName())){
                log.error("用户或密码错误");
                return JSON.toJSONString(Result.fail("用户或密码错误"));
            }
            /*subject.login(token);
            subject.getSession().setAttribute(UserUtils.USER, user);*/
            Result result = Result.success(user);
            result.setToken(UUID.randomUUID().toString().replace("-", ""));
            return JSON.toJSONString(result);
        }catch (Exception e){
            e.printStackTrace();
            log.error("用户登陆失败",e);
            return JSON.toJSONString(Result.fail("登陆失败"));
        }
    }
    @RequestMapping(value ="reg",method = {RequestMethod.POST})
    public String registration(@RequestBody User user, HttpServletRequest request){
        if(userIsEmpty(user)){
            log.error("用户或密码为空");
            return JSON.toJSONString(Result.fail("用户或密码为空"));
        }
        /*Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(),user.getPassWard());*/
        try {
            User userOther = userService.findByUserName(user.getUserName());
            if(userOther != null){
                log.error("用户已存在");
                return JSON.toJSONString(Result.fail("用户已存在"));
            }
            user = userService.registration(user);
            /*subject.login(token);
            subject.getSession().setAttribute(UserUtils.USER, user);*/
            Result result = Result.success(user);
            result.setToken(UUID.randomUUID().toString().replace("-", ""));
            return JSON.toJSONString(result);
        }catch (Exception e){
            e.printStackTrace();
            log.error("用户注册失败",e);
            return JSON.toJSONString(Result.fail("用户注册失败"));
        }
    }
    /**
     * 判断用户名和密码是否为空
     * @param user  用户
     * @return
     */
    private boolean userIsEmpty(User user){
        if(StringUtils.isEmpty(user.getUserName())||StringUtils.isEmpty(user.getPassWard())){
            log.error("用户或密码为空");
            return true;
        }else {
            return false;
        }
    }
}
