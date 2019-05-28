package com.hmily.basic.designmode.principle.singleresponsibility.example3;



public class ErrorExample {

    private int count = 0;

    private void updateUserInfo(String userName, String address) {
        /** 这个是一个伪代码，传进来的进来的值进行一个更新 */
        userName += count;
        address += count++;
    }

    private void updateUserInfo(String userName) {
        /** 这个是一个伪代码，传进来的进来的值进行一个更新 */
        userName += count++;
    }
}
