package com.example.bookbransaction.mapper;

import com.example.bookbransaction.entity.UserCoupon;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserCouponMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserCoupon record);

    UserCoupon selectByPrimaryKey(Integer id);

    List<UserCoupon> selectAll();

    int updateByPrimaryKey(UserCoupon record);
}