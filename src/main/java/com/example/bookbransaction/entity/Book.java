package com.example.bookbransaction.entity;

import java.util.Date;

/**
 * 图书表
 *
 * @author Michael Chow
 * @date   2019/11/12
 */
public class Book {
    /**
     * 
     */
    private Integer id;

    /**
     * 书号
     */
    private Long isbn;

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
    private String bookDescribe;

    /**
     *  图书类型
     */
    private BookType bookType;
    /**
     * 出版社
     */
    private Press press;
    /**
     * 作者
     */
    private Author author;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
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

    public String getBookDescribe() {
        return bookDescribe;
    }

    public void setBookDescribe(String bookDescribe) {
        this.bookDescribe = bookDescribe;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public Press getPress() {
        return press;
    }

    public void setPress(Press press) {
        this.press = press;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}