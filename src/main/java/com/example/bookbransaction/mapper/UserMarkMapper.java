package com.example.bookbransaction.mapper;

import com.example.bookbransaction.entity.UserMark;
import java.util.List;

public interface UserMarkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserMark record);

    UserMark selectByPrimaryKey(Integer id);

    List<UserMark> selectAll();

    int updateByPrimaryKey(UserMark record);
}