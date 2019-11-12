package com.example.bookbransaction.mapper;

import com.example.bookbransaction.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    /**
     * 通过id删除用户
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 生成插入用户
     * @param record
     * @return
     */
    int insert(User record);

    /**
     * 通过id获取用户
     * @param id
     * @return
     */
    User selectByPrimaryKey(Integer id);

    /**
     * 获取所有用户
     * @return
     */
    List<User> selectAll();

    /**
     * 通过过用户id获取用户
     * @param record
     * @return
     */
    int updateByPrimaryKey(User record);

    User selectByUserName(String userName);
}