package com.hmily.basic.designmode.principle.singleresponsibility.example3;


public class Example {

    private int count = 0;

    private void updateUserName(String userName) {
        userName += count;
    }
    private void updateUserAddress(String address) {
        address += count;
    }

}
