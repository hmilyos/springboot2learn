package com.hmily.passbook.service;

import com.hmily.passbook.vo.Feedback;
import com.hmily.passbook.vo.Response;

/**
 * @ClassName IFeedbackService
 * @Description 评论功能: 即用户评论相关功能实现
 * @Author Hmily
 * @Date 2019/6/18 8:54
 **/

public interface IFeedbackService {
    /**
     * 创建评论
     * @param feedback
     * @return
     */
    Response createFeedback(Feedback feedback);

    /**
     * 获取用户评论
     * @param userId
     * @return
     */
    Response getFeedback(Long userId);

}
