package com.example.bookbransaction.controller.book;

import com.example.bookbransaction.entity.Author;
import com.example.bookbransaction.entity.Book;
import com.example.bookbransaction.entity.BookType;
import com.example.bookbransaction.entity.Press;
import com.example.bookbransaction.model.base.Page;
import com.example.bookbransaction.model.base.Result;
import com.example.bookbransaction.model.book.BookRequest;
import com.example.bookbransaction.service.book.BookService;
import com.example.bookbransaction.utils.BaseUtil;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

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
    @RequestMapping(value = "getBookList",method = {RequestMethod.POST})
    public Result getBookList(@RequestBody BookRequest bookRequest){
        PageInfo<Book> pages =  bookService.getList(bookRequest);
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

    /**
     * 通过作者名字匹配获取作者信息
     * @param name
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "getAuthorByName",method = {RequestMethod.POST})
    public Result getAuthorByName(@RequestBody String name){
        Author author = bookService.getAuthorByName(name);
        return  Result.success(author);
    }

    /**
     * 通过出版社名字匹配获取作者信息
     * @param name
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "getPressByName",method = {RequestMethod.POST})
    public Result getPressByName(@RequestBody String name){
        Press press = bookService.getPressByName(name);
        return  Result.success(press);
    }

    /**
     * 获取图书类型
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "getBookType",method = {RequestMethod.POST})
    public Result getBookType(){
        List<BookType> press = bookService.getBookTypes();
        return  Result.success(press);
    }
}
