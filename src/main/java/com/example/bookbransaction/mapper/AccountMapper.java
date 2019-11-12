package com.example.bookbransaction.mapper;

import com.example.bookbransaction.entity.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface AccountMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(Account record);

    Account selectByPrimaryKey(Integer userId);

    List<Account> selectAll();

    int updateByPrimaryKey(Account record);
}