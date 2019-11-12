package com.example.bookbransaction.service.book;

import com.example.bookbransaction.entity.Book;
import com.example.bookbransaction.mapper.BookMapper;
import com.example.bookbransaction.model.base.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class BookServiceImpl implements BookService{
    @Resource
    private BookMapper bookMapper;
    @Override
    public Book fandById(Integer id) {
        return bookMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Book> fandByShopId(Integer shopId) {
        return null;
    }

    @Override
    public PageInfo<Book> getList(Page page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        return new PageInfo<Book>(bookMapper.selectAll());
    }

    @Override
    public void add(Book book) {

    }

    @Override
    public void update(Book book) {

    }

    @Override
    public void remove(Integer id) {

    }

}
