package com.example.bookbransaction.mapper;

import com.example.bookbransaction.entity.BookType;
import java.util.List;

public interface BookTypeMapper {
    int deleteByPrimaryKey(Integer typeId);

    int insert(BookType record);

    BookType selectByPrimaryKey(Integer typeId);

    List<BookType> selectAll();

    int updateByPrimaryKey(BookType record);
}