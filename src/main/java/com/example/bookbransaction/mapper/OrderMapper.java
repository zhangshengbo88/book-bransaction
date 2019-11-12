package com.example.bookbransaction.mapper;

import com.example.bookbransaction.entity.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface OrderMapper {
    int deleteByPrimaryKey(String orderNo);

    int insert(Order record);

    Order selectByPrimaryKey(String orderNo);

    List<Order> selectAll();

    int updateByPrimaryKey(Order record);
}