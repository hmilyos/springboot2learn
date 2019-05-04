package com.hmily.shardingjdbc.service;

import com.hmily.shardingjdbc.domain.User;

import java.util.List;

public interface IUserService {

    List<User> getUsers();

    void updateTransactional(User user);
}
