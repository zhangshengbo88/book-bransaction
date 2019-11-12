package com.example.bookbransaction.service.userinfo;

import com.example.bookbransaction.entity.User;

/**
 * 用户操作接口
 */
public interface UserService {
    /**
     * 通过用户名获取用户信息
     * @param name
     * @return
     */
    User findByUserName(String name);

    /**
     * 通过id获取用户信息
     * @param id
     * @return
     */
    User findById(Integer id);

    /**
     * 注册用户
     * @param record 用户信息
     */
    User  registration(User record);
}
