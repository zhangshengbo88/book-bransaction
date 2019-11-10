package com.example.bookbransaction.entity;

import java.util.Date;

/**
 * 订单表
 *
 * @author Michael Chow
 * @date   2019/11/10
 */
public class Order {
    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 购买者id
     */
    private Integer userId;

    /**
     * 对应图书id
     */
    private Integer bookId;

    /**
     * 订单状态：0-已取消；1-新建立；2-已支付；3-已完成；4-问题订单
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
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