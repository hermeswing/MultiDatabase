package com.db.multidatabase.user.service;

import com.db.multidatabase.dto.UserDto;

public interface MyUserService {
    UserDto selectUserById( int id);
}
