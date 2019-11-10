package com.example.bookbransaction.mapper;

import com.example.bookbransaction.entity.Author;
import java.util.List;

public interface AuthorMapper {
    int deleteByPrimaryKey(Integer authorId);

    int insert(Author record);

    Author selectByPrimaryKey(Integer authorId);

    List<Author> selectAll();

    int updateByPrimaryKey(Author record);
}