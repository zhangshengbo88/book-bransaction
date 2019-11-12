package com.example.bookbransaction.mapper;

import com.example.bookbransaction.entity.UserMark;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMarkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserMark record);

    UserMark selectByPrimaryKey(Integer id);

    List<UserMark> selectAll();

    int updateByPrimaryKey(UserMark record);
}