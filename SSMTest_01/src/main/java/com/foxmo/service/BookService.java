package com.foxmo.service;

import com.foxmo.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    //查询所有书籍信息
    List<Book> selectAllBook();

    //查询指定ID书籍信息
    Book selectBookById(@Param("bookID") int id);

    //新增书籍信息
    int addBook(Book book);

    //删除指定ID的书籍信息
    int deleteBookById(@Param("bookID") int id);

    //更新书籍信息
    int updateBook(Book book);
}
