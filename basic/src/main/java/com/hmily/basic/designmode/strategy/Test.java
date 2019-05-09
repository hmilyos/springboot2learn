package com.hmily.basic.designmode.strategy;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/8 13:07
 **/
public class Test {

    public static void main(String[] args) {
        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJjianActivityStrategy());
        PromotionActivity promotionActivity1111 = new PromotionActivity(new ManJianActivityStrategy());

        promotionActivity618.executePromotionStrategy();
        promotionActivity1111.executePromotionStrategy();
    }
}
