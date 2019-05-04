package com.hmily.shardingjdbc.service.impl;

import com.hmily.shardingjdbc.domain.User;
import com.hmily.shardingjdbc.mapper.UserMapper;
import com.hmily.shardingjdbc.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUsers() {
        List<User> users=userMapper.getAll();
        return users;
    }

    @Override
    public void updateTransactional(User user) {
        try{
            userMapper.insert(user);
            log.error(String.valueOf(user));
        }catch(Exception e){
            log.error("find exception!");
            throw e;   // 事物方法中，如果使用trycatch捕获异常后，需要将异常抛出，否则事物不回滚。
        }
    }
}
