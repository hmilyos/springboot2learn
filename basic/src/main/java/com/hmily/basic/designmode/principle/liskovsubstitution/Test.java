package com.hmily.basic.designmode.principle.liskovsubstitution;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName Test
 * @Description TODO
 * @Date 2019/5/30 9:15
 **/
@Slf4j
public class Test {
    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth()+1);
            log.info("width: {}, length: {}", rectangle.getWidth(), rectangle.getLength());
        }
        log.info("resize方法结束，width: {}, length: {}", rectangle.getWidth(), rectangle.getLength());
    }

    public static void main(String[] args) {
        testRectangle();
//        testSquare();
    }

    /** 长方形 */
    public static void testRectangle(){
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);
        resize(rectangle);
    }

//    /** 正方形 */
//    public static void testSquare(){
//        Square square = new Square();
//        square.setSidelength(10);
//        resize(square);
//    }
}
