package com.example.bookbransaction.mapper;

import com.example.bookbransaction.entity.Author;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface AuthorMapper {
    int deleteByPrimaryKey(Integer authorId);

    int insert(Author record);

    Author selectByPrimaryKey(Integer authorId);

    List<Author> selectAll();

    int updateByPrimaryKey(Author record);

    Author selectByName(String name);
}