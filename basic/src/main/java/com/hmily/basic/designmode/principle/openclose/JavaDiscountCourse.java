package com.hmily.basic.designmode.principle.openclose;

import java.math.BigDecimal;

/**
 * @ClassName JavaDiscountCourse
 * @Description 打折
 **/
public class JavaDiscountCourse extends JavaCourse {

    private Double ratio;

    private JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public JavaDiscountCourse(Integer id, String name, Double price, Double ratio) {
        super(id, name, price);
        this.ratio = ratio;
    }

    /**
     * 获取原价的方法
     **/
    public BigDecimal getOriginPrice() {
        return super.getPrice();
    }

    // 这里违反了 里式替换原则
//    @Override
//    public BigDecimal getPrice(){
//        return super.getPrice().multiply(new BigDecimal(ratio)).
//                divide(new BigDecimal("100"), 2, BigDecimal.ROUND_HALF_UP);
//    }
    public BigDecimal getDiscountPrice(){
        return super.getPrice().multiply(new BigDecimal(ratio)).
                divide(new BigDecimal("100"), 2, BigDecimal.ROUND_HALF_UP);
    }

    public Double getRatio() {
        return this.ratio;
    }
}
