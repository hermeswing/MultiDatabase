package com.db.multidatabase.user.service;

import com.db.multidatabase.dto.UserDto;

public interface PostUserService {
    UserDto selectUserById( int id);
}
