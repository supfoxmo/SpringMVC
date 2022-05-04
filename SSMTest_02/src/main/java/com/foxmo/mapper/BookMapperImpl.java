package com.foxmo.mapper;

import com.foxmo.pojo.Books;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class BookMapperImpl extends SqlSessionDaoSupport implements BookMapper{
    @Override
    public int addBook(Books book) {
        return getSqlSession().getMapper(BookMapper.class).addBook(book);
    }

    @Override
    public int deleteBookById(int id) {
        return getSqlSession().getMapper(BookMapper.class).deleteBookById(id);
    }

    @Override
    public int updateBook(Books book) {
        return getSqlSession().getMapper(BookMapper.class).updateBook(book);
    }

    @Override
    public Books queryBookById(int id) {
        return getSqlSession().getMapper(BookMapper.class).queryBookById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return getSqlSession().getMapper(BookMapper.class).queryAllBook();
    }
}
