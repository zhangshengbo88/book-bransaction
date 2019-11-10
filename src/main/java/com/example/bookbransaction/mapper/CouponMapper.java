package com.example.bookbransaction.mapper;

import com.example.bookbransaction.entity.Coupon;
import java.util.List;

public interface CouponMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Coupon record);

    Coupon selectByPrimaryKey(Integer id);

    List<Coupon> selectAll();

    int updateByPrimaryKey(Coupon record);
}