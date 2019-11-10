package com.example.bookbransaction.mapper;

import com.example.bookbransaction.entity.SysUser;
import java.util.List;

public interface SysUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysUser record);

    SysUser selectByPrimaryKey(Integer id);

    List<SysUser> selectAll();

    int updateByPrimaryKey(SysUser record);
}