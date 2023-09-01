package cn.icexmoon.mvcdemo.controller;

import cn.icexmoon.mvcdemo.config.SpringConfig;
import cn.icexmoon.mvcdemo.entity.Book;
import cn.icexmoon.mvcdemo.service.BookService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : mvc-demo-parent
 * @Package : cn.icexmoon.mvcdemo.controller
 * @ClassName : .java
 * @createTime : 2023/9/1 12:31
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTests {
    @Autowired
    private BookService bookService;
    @Test
    public void testSelectAllBooks(){
        List<Book> allBooks = bookService.getAllBooks();
        Assert.assertNotNull(allBooks);
        Assert.assertNotEquals(0, allBooks.size());
    }
}
