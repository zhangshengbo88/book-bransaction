package com.example.bookbransaction.entity;

import java.util.Date;

/**
 * 购物车
 *
 * @author Michael Chow
 * @date   2019/11/11
 */
public class ShoppingCart {
    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 图书id
     */
    private Integer bookId;

    /**
     * 状态：0-删除，1-正常，2-已生成订单
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