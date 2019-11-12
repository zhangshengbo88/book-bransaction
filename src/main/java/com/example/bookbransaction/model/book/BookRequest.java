package com.example.bookbransaction.model.book;

import com.example.bookbransaction.entity.Book;

/**
 * 图书查询实体类
 */
public class BookRequest {
    private int pageNum;//第几页
    private int pageSize;//每页多少条
    private Book book;

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
