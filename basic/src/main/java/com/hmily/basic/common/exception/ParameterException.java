package com.hmily.basic.common.exception;

public class ParameterException extends CustomRuntimeException {

    public ParameterException(String msg) {
        super(msg);
    }

    public ParameterException(int status, String msg) {
        super(status, msg);
    }

    public ParameterException(int status, String msg, Object data) {
        super(status, msg, data);
    }
}
