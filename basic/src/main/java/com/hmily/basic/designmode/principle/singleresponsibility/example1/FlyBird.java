package com.hmily.basic.designmode.principle.singleresponsibility.example1;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlyBird {
    public void mainMoveMode(String birdName){
        log.info("{} 用翅膀飞", birdName);
    }
}
