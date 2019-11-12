package com.example.bookbransaction.service.book;

import com.example.bookbransaction.entity.Author;
import com.example.bookbransaction.entity.Book;
import com.example.bookbransaction.entity.BookType;
import com.example.bookbransaction.entity.Press;
import com.example.bookbransaction.mapper.AuthorMapper;
import com.example.bookbransaction.mapper.BookMapper;
import com.example.bookbransaction.mapper.BookTypeMapper;
import com.example.bookbransaction.mapper.PressMapper;
import com.example.bookbransaction.model.base.Page;
import com.example.bookbransaction.model.book.BookRequest;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class BookServiceImpl implements BookService{
    @Resource
    private BookMapper bookMapper;
    @Resource
    private BookTypeMapper bookTypeMapper;
    @Resource
    private AuthorMapper authorMapper;
    @Resource
    private PressMapper pressMapper;
    @Override
    public Book fandById(Integer id) {
        return bookMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Book> fandByShopId(Integer shopId) {
        return null;
    }

    @Override
    public PageInfo<Book> getList(BookRequest bookRequest) {
        PageHelper.startPage(bookRequest.getPageNum(), bookRequest.getPageSize());
        return new PageInfo<Book>(bookMapper.selectByParam(bookRequest.getBook()));
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

    @Override
    public Author getAuthorByName(String authorName) {
        return authorMapper.selectByName(authorName);
    }

    @Override
    public List<BookType> getBookTypes() {
        return bookTypeMapper.selectAll();
    }

    @Override
    public Press getPressByName(String pressName) {
        return pressMapper.selectByName(pressName);
    }

}
