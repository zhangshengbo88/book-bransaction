package com.example.bookbransaction.mapper;

import com.example.bookbransaction.entity.Location;
import java.util.List;

public interface LocationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Location record);

    Location selectByPrimaryKey(Integer id);

    List<Location> selectAll();

    int updateByPrimaryKey(Location record);
}