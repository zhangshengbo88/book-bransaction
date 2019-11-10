package com.example.bookbransaction.mapper;

import com.example.bookbransaction.entity.TransactionDetails;
import java.util.List;

public interface TransactionDetailsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TransactionDetails record);

    TransactionDetails selectByPrimaryKey(Integer id);

    List<TransactionDetails> selectAll();

    int updateByPrimaryKey(TransactionDetails record);
}