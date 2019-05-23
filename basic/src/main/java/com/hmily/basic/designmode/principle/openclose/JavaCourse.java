package com.hmily.basic.designmode.principle.openclose;

import java.math.BigDecimal;

/**
 * @ClassName JavaCourse
 * @Description 定义一个Java课程的类并且实现课程接口
 **/
public class JavaCourse implements ICourse {

    private Integer id;
    private String name;
    private BigDecimal price;

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = new BigDecimal(price);
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public BigDecimal getPrice() {
        return this.price;
    }
}
