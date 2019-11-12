package com.example.bookbransaction.mapper;

import com.example.bookbransaction.entity.ShoppingCart;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ShoppingCartMapper {
    int deleteByPrimaryKey(@Param("userId") Integer userId, @Param("bookId") Integer bookId);

    int insert(ShoppingCart record);

    ShoppingCart selectByPrimaryKey(@Param("userId") Integer userId, @Param("bookId") Integer bookId);

    List<ShoppingCart> selectAll();

    int updateByPrimaryKey(ShoppingCart record);
}