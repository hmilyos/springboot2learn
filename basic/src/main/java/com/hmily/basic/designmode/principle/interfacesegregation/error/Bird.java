package com.hmily.basic.designmode.principle.interfacesegregation.error;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Bird implements IAnimalAction {
    @Override
    public void eat() {
        log.info("dog eatting");
    }

    @Override
    public void fly() {
        /** 鸟不一定会飞，比如鸵鸟 */
    }

    @Override
    public void swim() {
        /** 鸟不一定会游泳 */
    }
}
