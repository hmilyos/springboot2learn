package com.hmily.basic.designmode.pattern.strategy;

/**
 * @ClassName PromotionActivity
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/9 9:05
 **/
public class PromotionActivity {

    private IActivityStrategy activityStrategy;

    public PromotionActivity(IActivityStrategy activityStrategy) {
        this.activityStrategy = activityStrategy;
    }

    public void executePromotionStrategy(){
        activityStrategy.doPromotion();
    }
}
