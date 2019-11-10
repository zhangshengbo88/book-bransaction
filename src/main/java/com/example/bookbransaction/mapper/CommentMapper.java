package com.example.bookbransaction.mapper;

import com.example.bookbransaction.entity.Comment;
import java.util.List;

public interface CommentMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Comment record);

    Comment selectByPrimaryKey(Integer orderId);

    List<Comment> selectAll();

    int updateByPrimaryKey(Comment record);
}