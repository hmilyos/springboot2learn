package com.hmily.shardingjdbc.mapper;

import com.hmily.shardingjdbc.domain.User;

import java.util.List;

public interface UserMapper {

    List<User> getAll();

//    void update(User user);

    void insert (User user);
}
