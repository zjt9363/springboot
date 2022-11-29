package com.demo05_mybatis_plus.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo05_mybatis_plus.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookDao extends BaseMapper<Book> {

    public Book getById(Integer id);

}
