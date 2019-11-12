package com.example.bookbransaction.mapper;

import com.example.bookbransaction.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface SysUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysUser record);

    SysUser selectByPrimaryKey(Integer id);

    List<SysUser> selectAll();

    int updateByPrimaryKey(SysUser record);
}