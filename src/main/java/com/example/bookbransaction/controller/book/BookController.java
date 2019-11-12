package com.example.bookbransaction.controller.book;

import com.example.bookbransaction.entity.Book;
import com.example.bookbransaction.model.base.Page;
import com.example.bookbransaction.model.base.Result;
import com.example.bookbransaction.service.book.BookService;
import com.example.bookbransaction.utils.BaseUtil;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("book")
public class BookController {
    private static final Logger log = LoggerFactory.getLogger(BookController.class);
    @Resource
    private BookService bookService;
    /**
     * 批量获取图书
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "getList",method = {RequestMethod.POST})
    public Result getBookList(@RequestBody Page page){
        PageInfo<Book> pages =  bookService.getList(page);
        Result result = Result.success(pages.getList());
        result.setPage(BaseUtil.buildPage(pages));
        return result;
    }

    /**
     * 通过id获取图书
     * @param id
     * @return
     */
    @RequestMapping(value = "getBookById",method = {RequestMethod.POST})
    public Result getBookById(Integer id){
        Book book = bookService.fandById(id);
        Result result = Result.success(book);
        return result;
    }

    /**
     * 添加图书
     * @param book
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "addBook",method = {RequestMethod.POST})
    public Result addBook(@RequestBody Book book){
        try {
            bookService.add(book);
        }catch (Exception e) {
            return Result.fail(e.getMessage());
        }
        return Result.success();
    }

    /**
     * 修改图书
     * @param book
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "modifyBook",method = {RequestMethod.POST})
    public Result modifyBook(@RequestBody Book book){
        try {
            bookService.update(book);
        }catch (Exception e) {
            return Result.fail(e.getMessage());
        }
        return Result.success();
    }
    /**
     * 逻辑删除图书
     * @param id
     * @return
     */
    @RequestMapping(value = "removeBook",method = {RequestMethod.POST})
    public Result removeBook(Integer id){
        try {
            bookService.remove(id);
        }catch (Exception e) {
            return Result.fail(e.getMessage());
        }
        return Result.success();
    }
}
