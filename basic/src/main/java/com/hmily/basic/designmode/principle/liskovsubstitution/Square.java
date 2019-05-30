package com.hmily.basic.designmode.principle.liskovsubstitution;

/**
 * @ClassName Square
 * @Description TODO
 * @Date 2019/5/30 9:13
 **/
public class Square implements Quadrangle {

    private long sidelength;

    @Override
    public long getWidth() {
        return sidelength;
    }

    @Override
    public long getLength() {
        return sidelength;
    }

    public long getSidelength() {
        return sidelength;
    }

    public void setSidelength(long sidelength) {
        this.sidelength = sidelength;
    }
}
