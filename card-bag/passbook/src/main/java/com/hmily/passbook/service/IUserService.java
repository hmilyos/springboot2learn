package com.hmily.passbook.service;

import com.hmily.passbook.vo.Response;
import com.hmily.passbook.vo.User;

/**
 * @ClassName IUserService
 * @Description 用户服务: 创建 User 服务
 * @Author Hmily
 * @Date 2019/6/18 8:50
 **/

public interface IUserService {
    /**
     * 创建 User
     * @param user
     * @return
     * @throws Exception
     */
    Response createUser(User user) throws Exception;
}
