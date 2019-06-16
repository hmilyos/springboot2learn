package com.hmily.merchants.security;

/**
 * @ClassName AccessContext
 * @Description 用 ThreadLocal 去单独存储每一个线程携带的 Token 信息
 * @Author Hmily
 * @Date 2019/6/16 11:09
 **/
public class AccessContext {
    private static final ThreadLocal<String> token = new ThreadLocal<String>();

    public static String getToken() {
        return token.get();
    }

    public static void setToken(String tokenStr) {
        token.set(tokenStr);
    }

    public static void clearAccessKey() {
        token.remove();
    }
}
