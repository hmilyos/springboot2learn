package com.hmily.basic.designmode.strategy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @ClassName ManJianStrategy
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/8 13:08
 **/
@Slf4j
@Component
public class ManJianActivityStrategy implements IActivityStrategy {
    @Override
    public String getActivityType() {
        return "MANJIAN";
    }

    @Override
    public void doPromotion() {
        log.info("满减活动，满 200 减 30");
    }

    @Override
    public String getActivityName() {
        return "满减";
    }
}
