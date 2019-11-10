package com.example.bookbransaction.entity;

import java.util.Date;

/**
 * 评论表
 *
 * @author Michael Chow
 * @date   2019/11/10
 */
public class Comment {
    /**
     * 订单id
     */
    private Integer orderId;

    /**
     * 评分
     */
    private Integer score;

    /**
     * 评语
     */
    private String comment;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private Date updateTime;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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