package com.example.demo03_junit.dao.impl;

import com.example.demo03_junit.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("BookDao is running");
    }
}
