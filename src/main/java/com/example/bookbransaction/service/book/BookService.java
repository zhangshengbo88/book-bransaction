package com.example.bookbransaction.service.book;

import com.example.bookbransaction.entity.Book;
import com.example.bookbransaction.model.base.Page;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 图书相关接口
 */
public interface BookService {
    /**
     * 根据id获取图书明细
     * @param id
     * @return
     */
    Book fandById(Integer id);

    /**
     * 根据店铺id获取其对应图书
     * @param shopId
     * @return
     */
    List<Book> fandByShopId(Integer shopId);

    /**
     * 批量获取图书明细
     * @param page
     * @return
     */
    PageInfo<Book> getList(Page page);

    /**
     * 添加图书
     * @param book
     */
    void add(Book book);

    /**
     * 修改图书
     * @param book
     */
    void update(Book book);

    /**
     * 逻辑删除图书
     * @param id
     */
    void  remove(Integer id);
}
