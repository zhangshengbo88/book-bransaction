package com.example.bookbransaction.mapper;

import com.example.bookbransaction.entity.Bookshop;
import java.util.List;

public interface BookshopMapper {
    int insert(Bookshop record);

    List<Bookshop> selectAll();
}