package com.hmily.basic.designmode.principle.liskovsubstitution;

import lombok.Data;

/**
 * @ClassName Rectangle
 * @Description TODO
 * @Date 2019/5/30 9:11
 **/
@Data
public class Rectangle implements Quadrangle {

    private long length;
    private long width;

}
