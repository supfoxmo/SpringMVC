package service;

import com.foxmo.pojo.Books;
import com.foxmo.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class BookServiceTest {
    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = applicationContext.getBean("BookServiceImpl", BookService.class);
        List<Books> booksList = bookService.queryAllBook();
        for (Books books : booksList) {
            System.out.println(books);
        }
    }
}
