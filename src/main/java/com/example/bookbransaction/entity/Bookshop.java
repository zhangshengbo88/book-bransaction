package com.example.bookbransaction.entity;

/**
 * 商店拥有图书表
 *
 * @author Michael Chow
 * @date   2019/11/11
 */
public class Bookshop {
    /**
     * 商店id
     */
    private Integer shopId;

    /**
     * 图书id
     */
    private Integer bookId;

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }
}