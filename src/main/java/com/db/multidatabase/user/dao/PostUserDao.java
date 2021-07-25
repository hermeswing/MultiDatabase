package com.db.multidatabase.user.dao;

import com.db.multidatabase.dto.UserDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PostUserDao {
    private final SqlSession sqlSession;

    public PostUserDao( @Qualifier("primarySqlSessionTemplate") SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public UserDto selectUserById( int id){
        return this.sqlSession.selectOne("com.db.multidatabase.user.dao.PostUserDao.selectUserById", id);
    }
}
