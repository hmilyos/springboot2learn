package com.hmily.basic.designmode.pattern.strategy;

public interface IActivityStrategy {

    Integer getActivityType();

    void doPromotion();

    String getActivityName();
}
