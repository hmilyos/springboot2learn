package com.hmily.basic.designmode.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName PromotionActivityConfig
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/9 12:53
 **/
@Configuration
public class PromotionActivityConfig {
    @Autowired
    private List<IActivityStrategy> activityStrategyList;

    @Bean
    public Map<Integer, IActivityStrategy> activityStrategyMap(){
        Map<Integer, IActivityStrategy> strategyMap = new HashMap<>();
        for (IActivityStrategy activityStrategy: activityStrategyList) {
            strategyMap.put(activityStrategy.getActivityType(), activityStrategy);
        }
        return strategyMap;
    }

}
