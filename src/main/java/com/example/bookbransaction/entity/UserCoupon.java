package com.example.bookbransaction.entity;

import java.util.Date;

/**
 * 用户票卷表
 *
 * @author Michael Chow
 * @date   2019/11/10
 */
public class UserCoupon {
    /**
     * 
     */
    private Integer id;

    /**
     * 票券id
     */
    private Integer couponId;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 类型id
     */
    private Integer typeId;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 领取时间
     */
    private Date createTime;

    /**
     * 使用时间
     */
    private Date useTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
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

    public Date getUseTime() {
        return useTime;
    }

    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }
}