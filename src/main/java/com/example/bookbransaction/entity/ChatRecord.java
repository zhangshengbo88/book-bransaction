package com.example.bookbransaction.entity;

import java.util.Date;

/**
 * 聊天记录
 *
 * @author Michael Chow
 * @date   2019/11/10
 */
public class ChatRecord {
    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 联系人id
     */
    private Integer contactId;

    /**
     * 消息内容
     */
    private String message;

    /**
     * 创建时间
     */
    private Date createTime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}