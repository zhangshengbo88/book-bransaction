package com.example.bookbransaction.mapper;

import com.example.bookbransaction.entity.SysModel;
import java.util.List;

public interface SysModelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysModel record);

    SysModel selectByPrimaryKey(Integer id);

    List<SysModel> selectAll();

    int updateByPrimaryKey(SysModel record);
}