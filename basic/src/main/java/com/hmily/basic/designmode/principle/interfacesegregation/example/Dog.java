package com.hmily.basic.designmode.principle.interfacesegregation.example;


import lombok.extern.slf4j.Slf4j;

/**
 * 切记！！！
 * 我们在设计接口的时候，也不能分的太细，让接口过多;接口隔离原则在使用的时候，
 * 一定要适度，用的过多，或者过少都是不好的。
 */
@Slf4j
public class Dog implements IEatAnimalAction, ISwimAnimalAction {
    @Override
    public void eat() {
        log.info(" dog eatting");
    }

    @Override
    public void swim() {
        log.info(" dog swimming ");
    }
}
