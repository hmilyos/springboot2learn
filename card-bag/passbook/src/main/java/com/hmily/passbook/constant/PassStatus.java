package com.hmily.passbook.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @ClassName PassStatus
 * @Description 优惠券的状态
 * @Author Hmily
 * @Date 2019/6/16 16:15
 **/
@Getter
@AllArgsConstructor
public enum PassStatus {

    UNUSED(1, "未被使用的"),
    USED(2, "已经使用的"),
    ALL(3, "全部领取的");

    /** 状态码 */
    private Integer code;

    /** 状态描述 */
    private String desc;
}
