package com.example.bookbransaction.mapper;

import com.example.bookbransaction.entity.Bookshop;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BookshopMapper {
    int insert(Bookshop record);

    List<Bookshop> selectAll();
}