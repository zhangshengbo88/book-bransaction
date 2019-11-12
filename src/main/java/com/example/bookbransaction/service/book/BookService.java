package com.example.bookbransaction.service.book;

import com.example.bookbransaction.entity.Author;
import com.example.bookbransaction.entity.Book;
import com.example.bookbransaction.entity.BookType;
import com.example.bookbransaction.entity.Press;
import com.example.bookbransaction.model.base.Page;
import com.example.bookbransaction.model.book.BookRequest;
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
     * @param bookRequest
     * @return
     */
    PageInfo<Book> getList(BookRequest bookRequest);

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

    /**
     * 通过作者名字查询作者信息
     * @param authorName
     * @return
     */
    Author getAuthorByName(String authorName);

    /**
     * 获取图书类型
     * @return
     */
    List<BookType> getBookTypes();

    /**
     * 获取出版社信息
     * @param pressName
     * @return
     */
    Press getPressByName(String pressName);
}
