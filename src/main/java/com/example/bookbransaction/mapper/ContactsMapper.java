package com.example.bookbransaction.mapper;

import com.example.bookbransaction.entity.Contacts;
import java.util.List;

public interface ContactsMapper {
    int insert(Contacts record);

    List<Contacts> selectAll();
}