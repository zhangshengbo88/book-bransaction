package com.example.bookbransaction.mapper;

import com.example.bookbransaction.entity.ChatRecord;
import java.util.List;

public interface ChatRecordMapper {
    int insert(ChatRecord record);

    List<ChatRecord> selectAll();
}