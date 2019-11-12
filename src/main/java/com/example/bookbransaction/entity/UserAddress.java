package com.example.bookbransaction.entity;

import java.util.Date;

/**
 * 用户联系地址表
 *
 * @author Michael Chow
 * @date   2019/11/11
 */
public class UserAddress {
    /**
     * 索引id
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 地址名称
     */
    private String name;

    /**
     * 地址
     */
    private String address;

    /**
     * 状态：0-删除、1-正常
     */
    private Byte status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}