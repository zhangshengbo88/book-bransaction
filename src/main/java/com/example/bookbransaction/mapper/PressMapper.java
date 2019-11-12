package com.example.bookbransaction.mapper;

import com.example.bookbransaction.entity.Press;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface PressMapper {
    int deleteByPrimaryKey(Integer pressId);

    int insert(Press record);

    Press selectByPrimaryKey(Integer pressId);

    List<Press> selectAll();

    int updateByPrimaryKey(Press record);

    Press selectByName(String name);
}