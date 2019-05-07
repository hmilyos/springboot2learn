package com.hmily.basic.controller.handler;

import com.hmily.basic.common.dto.ServerResponse;
import com.hmily.basic.common.enums.ResponseCode;
import com.hmily.basic.common.exception.CustomRuntimeException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName GlobalDefaultExceptionHandler
 * @Description 全局异常捕捉
 * @Author ouShiming
 * @Date 2019/5/7 23:23
 **/

@ControllerAdvice
@Slf4j
public class GlobalDefaultExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseStatus(HttpStatus.OK)
    public ServerResponse handleRuntimeException(HttpServletRequest req, RuntimeException ex) {
        log.error("{} RuntimeException: ", req.getRequestURI(), ex);
        return ServerResponse.createByErrorCodeMessage(ResponseCode.ERROR.getCode(), "系统内部运行时出错");
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseStatus(HttpStatus.OK)
    public ServerResponse handleException(HttpServletRequest req, RuntimeException ex) {
        log.error("{} Exception: ", req.getRequestURI(), ex);
        return ServerResponse.createByErrorCodeMessage(ResponseCode.ERROR.getCode(), "系统内部出错");
    }

    @ExceptionHandler(CustomRuntimeException.class)
    @ResponseBody
//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseStatus(HttpStatus.OK)
    public ServerResponse handleCustomRuntimeException(HttpServletRequest req, CustomRuntimeException ex) {
        log.error("{} CustomRuntimeException: ", req.getRequestURI(), ex);
        return ServerResponse.createByErrorCodeMessage(ex.getStatus(), ex.getMsg(), ex.getData());
    }
}
