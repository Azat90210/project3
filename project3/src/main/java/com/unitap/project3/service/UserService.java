package com.unitap.project3.service;

import com.unitap.project3.dto.UserDto;
import com.unitap.project3.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}
