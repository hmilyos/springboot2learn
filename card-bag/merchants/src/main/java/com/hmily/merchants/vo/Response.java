package com.hmily.merchants.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Response
 * @Description 通用的响应对象
 * @Author Hmily
 * @Date 2019/6/16 11:30
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response {
    /**
     * 错误码, 正确返回 0
     */
    private Integer errorCode = 0;

    /**
     * 错误信息, 正确返回空字符串
     * */
    private String errorMsg = "";

    /**
     * 返回值对象
     * */
    private Object data;

    /**
     * 正确的响应构造函数
     * @param data
     * */
    public Response(Object data) {
        this.data = data;
    }
}
