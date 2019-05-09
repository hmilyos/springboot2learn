package com.hmily.basic.designmode.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/8 13:07
 **/
@RestController
public class StrategyController {

    @Autowired
    protected Map<Integer, IActivityStrategy> activityStrategyMap;

    @GetMapping("/testActivityStrategy")
    public String testActivityStrategy(){
        IActivityStrategy activityStrategy = activityStrategyMap.get(1);
        activityStrategy.doPromotion();
        return activityStrategy.getActivityName();
    }


    public static void main(String[] args) {
        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJjianActivityStrategy());
        PromotionActivity promotionActivity1111 = new PromotionActivity(new ManJianActivityStrategy());

        promotionActivity618.executePromotionStrategy();
        promotionActivity1111.executePromotionStrategy();
    }
}
