package com.example.bookbransaction.mapper;

import com.example.bookbransaction.entity.BookType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BookTypeMapper {
    int deleteByPrimaryKey(Integer typeId);

    int insert(BookType record);

    BookType selectByPrimaryKey(Integer typeId);

    List<BookType> selectAll();

    int updateByPrimaryKey(BookType record);
}