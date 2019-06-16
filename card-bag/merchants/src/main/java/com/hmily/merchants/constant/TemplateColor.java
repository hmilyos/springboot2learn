package com.hmily.merchants.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @ClassName TemplateColor
 * @Description 卡包里面优惠券的背景颜色
 * @Author Hmily
 * @Date 2019/6/16 11:03
 **/
@Getter
public enum TemplateColor {
    RED(1, "红色"),
    GREEN(2, "绿色"),
    BLUE(3, "蓝色");

    /** 颜色代码 */
    private Integer code;

    /** 颜色描述 */
    private String color;

    TemplateColor(Integer code, String color) {
        this.code = code;
        this.color = color;
    }


}
