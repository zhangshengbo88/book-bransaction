package com.example.bookbransaction.mapper;

import com.example.bookbransaction.entity.Account;
import java.util.List;

public interface AccountMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(Account record);

    Account selectByPrimaryKey(Integer userId);

    List<Account> selectAll();

    int updateByPrimaryKey(Account record);
}