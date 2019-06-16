package com.hmily.passbook.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @ClassName FeedbackType
 * @Description 评论类型枚举
 * @Author Hmily
 * @Date 2019/6/16 16:16
 **/
@Getter
@AllArgsConstructor
public enum  FeedbackType {
    PASS("pass", "针对优惠券的评论"),
    APP("app", "针对卡包 App 的评论");

    /** 评论类型编码 */
    private String code;

    /** 评论类型描述 */
    private String desc;
}
