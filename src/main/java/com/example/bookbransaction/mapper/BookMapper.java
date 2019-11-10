package com.example.bookbransaction.mapper;

import com.example.bookbransaction.entity.Book;
import java.util.List;

public interface BookMapper {
    int deleteByPrimaryKey(Integer isbn);

    int insert(Book record);

    Book selectByPrimaryKey(Integer isbn);

    List<Book> selectAll();

    int updateByPrimaryKey(Book record);
}