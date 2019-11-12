package com.example.bookbransaction.mapper;

import com.example.bookbransaction.entity.ChatRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ChatRecordMapper {
    int insert(ChatRecord record);

    List<ChatRecord> selectAll();
}