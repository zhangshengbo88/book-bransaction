package com.example.bookbransaction.mapper;

import com.example.bookbransaction.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CommentMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Comment record);

    Comment selectByPrimaryKey(Integer orderId);

    List<Comment> selectAll();

    int updateByPrimaryKey(Comment record);
}