package com.example.bookbransaction.entity;

/**
 * 联系人
 *
 * @author Michael Chow
 * @date   2019/11/10
 */
public class Contacts {
    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 联系人id
     */
    private Integer contactId;

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
}