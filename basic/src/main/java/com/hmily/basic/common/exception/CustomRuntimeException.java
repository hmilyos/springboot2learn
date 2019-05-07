package com.hmily.basic.common.exception;

import com.hmily.basic.common.enums.ResponseCode;
import lombok.Getter;

/**
 * 全局自定义异常
 */

@Getter
public class CustomRuntimeException extends  RuntimeException {

    private int status;
    private String msg;
    private Object data;

    public CustomRuntimeException(String msg) {
        super(msg);
        this.status = ResponseCode.ERROR.getCode();
        this.msg = msg;
    }

    public CustomRuntimeException(int status, String msg) {
        super(msg);
        this.status = status;
        this.msg = msg;
    }

    public CustomRuntimeException(int status, String msg, Object data) {
        super(msg);
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

}
