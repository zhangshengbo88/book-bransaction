package com.example.bookbransaction.mapper;

import com.example.bookbransaction.entity.Contacts;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ContactsMapper {
    int insert(Contacts record);

    List<Contacts> selectAll();
}