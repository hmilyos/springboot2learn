package com.hmily.basic.designmode.principle.dependenceinversion;

import java.math.BigDecimal;

/**
 * @ClassName ICourse
 * @Description 开闭原则
 * @Author hmily
 * @Date 2019/5/23 8:23
 **/

public interface ICourse {

    Integer getId();

    String getName();

    BigDecimal getPrice();
}
