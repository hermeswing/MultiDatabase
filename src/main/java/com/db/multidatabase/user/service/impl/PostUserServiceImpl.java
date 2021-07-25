package com.db.multidatabase.user.service.impl;

import com.db.multidatabase.dto.UserDto;
import com.db.multidatabase.user.dao.PostUserDao;
import com.db.multidatabase.user.service.PostUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service( "postUserService" )
public class PostUserServiceImpl implements PostUserService {
    @Autowired
    PostUserDao userDao;

    public UserDto selectUserById( int id ) {
        return userDao.selectUserById( id );
    }
}
