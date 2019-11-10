package com.example.bookbransaction.mapper;

import com.example.bookbransaction.entity.UserAddress;
import java.util.List;

public interface UserAddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserAddress record);

    UserAddress selectByPrimaryKey(Integer id);

    List<UserAddress> selectAll();

    int updateByPrimaryKey(UserAddress record);
}