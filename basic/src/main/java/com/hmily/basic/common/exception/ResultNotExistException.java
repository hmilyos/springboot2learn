package com.hmily.basic.common.exception;

public class ResultNotExistException extends CustomRuntimeException {
    public ResultNotExistException(String msg) {
        super(msg);
    }

    public ResultNotExistException(int status, String msg) {
        super(status, msg);
    }

    public ResultNotExistException(int status, String msg, Object data) {
        super(status, msg, data);
    }
}
