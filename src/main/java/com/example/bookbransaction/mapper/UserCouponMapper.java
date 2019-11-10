package com.example.bookbransaction.mapper;

import com.example.bookbransaction.entity.UserCoupon;
import java.util.List;

public interface UserCouponMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserCoupon record);

    UserCoupon selectByPrimaryKey(Integer id);

    List<UserCoupon> selectAll();

    int updateByPrimaryKey(UserCoupon record);
}