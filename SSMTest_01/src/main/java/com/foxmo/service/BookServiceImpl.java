package com.foxmo.service;

import com.foxmo.mapper.BookMapper;
import com.foxmo.pojo.Book;

import java.util.List;

public class BookServiceImpl implements BookService{
    private com.foxmo.mapper.BookMapper bookMapper;

    public void setBookMapper(com.foxmo.mapper.BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public List<Book> selectAllBook() {
        return bookMapper.selectAllBook();
    }

    @Override
    public Book selectBookById(int id) {
        return bookMapper.selectBookById(id);
    }

    @Override
    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }
}
