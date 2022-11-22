package com.example.demo03_junit;

import com.example.demo03_junit.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo03JunitApplicationTests {

    @Autowired
    private BookDao bookDao;



    @Test
    void contextLoads() {
        bookDao.save();
    }

}
