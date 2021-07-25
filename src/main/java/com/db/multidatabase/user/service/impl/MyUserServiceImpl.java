package com.db.multidatabase.user.service.impl;

import com.db.multidatabase.dto.UserDto;
import com.db.multidatabase.user.dao.MyUserDao;
import com.db.multidatabase.user.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service( "myUserService" )
public class MyUserServiceImpl implements MyUserService {
    @Autowired
    MyUserDao userDao;

    public UserDto selectUserById( int id ) {
        return userDao.selectUserById( id );
    }
}
