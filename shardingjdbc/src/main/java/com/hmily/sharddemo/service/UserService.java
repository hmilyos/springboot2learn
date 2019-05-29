package com.hmily.sharddemo.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hmily.sharddemo.domain.UserEntity;
import com.hmily.sharddemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName UserService
 * @Description TODO
 * @Date 2019/5/29 9:50
 **/
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional(rollbackFor = Exception.class)
    public boolean save(UserEntity user) {
        return userMapper.insert(user) > 0;
    }

    public List<UserEntity> findAll() {
        List<UserEntity> userEntities = userMapper.selectAll();
        return userEntities;
    }

    public UserEntity getOne(int id){
        return userMapper.selectByPrimaryKey(id);
    }
}
