package com.example.bookbransaction.entity;

import java.util.Date;

/**
 * 图书表
 *
 * @author Michael Chow
 * @date   2019/11/10
 */
public class Book {
    /**
     * 书号
     */
    private Integer isbn;

    /**
     * 图书名称
     */
    private String bootName;

    /**
     * 作者id
     */
    private Integer authorId;

    /**
     * 拥有者
     */
    private Integer userId;

    /**
     * 图片地址
     */
    private String imageUsl;

    /**
     * 出版社id
     */
    private Integer pressId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 状态：0：新建；1：发布；2：下架；3：交易中；4已出售
     */
    private Short status;

    /**
     * 分类
     */
    private Integer typeId;

    /**
     * 描述
     */
    private String describe;

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public String getBootName() {
        return bootName;
    }

    public void setBootName(String bootName) {
        this.bootName = bootName;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getImageUsl() {
        return imageUsl;
    }

    public void setImageUsl(String imageUsl) {
        this.imageUsl = imageUsl;
    }

    public Integer getPressId() {
        return pressId;
    }

    public void setPressId(Integer pressId) {
        this.pressId = pressId;
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

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}