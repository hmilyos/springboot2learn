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
public class LiJjianActivityStrategy implements IActivityStrategy {
    @Override
    public Integer getActivityType() {
        return 1;
    }

    @Override
    public void doPromotion() {
        log.info("立减活动，下单马上减 20");
    }

    @Override
    public String getActivityName() {
        return "立减";
    }
}
