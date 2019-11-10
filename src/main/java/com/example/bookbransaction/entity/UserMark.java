package com.example.bookbransaction.entity;

import java.util.Date;

/**
 * 用户操作记录表
 *
 * @author Michael Chow
 * @date   2019/11/10
 */
public class UserMark {
    /**
     * 索引id
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 用户登陆IP
     */
    private String ip;

    /**
     * 操作：0-登陆、1-修改密码
     */
    private Short mark;

    /**
     * 操作时间
     */
    private Date createTime;

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

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Short getMark() {
        return mark;
    }

    public void setMark(Short mark) {
        this.mark = mark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}