package com.hmily.basic.designmode.principle.interfacesegregation.error;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Dog implements IAnimalAction {
    @Override
    public void eat() {
        log.info("dog eatting");
    }

    @Override
    public void fly() {
        /** 狗不会飞，这里是会有一个空的实现在这里 */
    }

    @Override
    public void swim() {
        log.info("dog swim");
    }
}
