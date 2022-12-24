package com.demo07_ssmp.dao;


import com.demo07_ssmp.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookDaoTests {


    @Autowired
    private BookDao bookDao;

    @Test
    void testGetById(){
        System.out.println(bookDao.selectById(1));
    }

    @Test
    void testSave(){
        Book book = new Book();
        book.setType("测试数据1");
        book.setName("测试数据2");
        book.setDescription("测试数据3");
        book.setId(4);
        bookDao.insert(book);
    }


}
