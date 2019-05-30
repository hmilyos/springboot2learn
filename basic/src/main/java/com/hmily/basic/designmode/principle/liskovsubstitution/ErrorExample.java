package com.hmily.basic.designmode.principle.liskovsubstitution;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName ErrorExample
 * @Description 里式替换的错误示例
 * @Date 2019/5/30 8:50
 **/

@Slf4j
public class ErrorExample {

//    长方形
    @Data
    static class Rectangle {
        private long length;
        private long width;
    }
//    正方形
    @Data
    static class Square extends Rectangle{
        private long sidelength;

        @Override
        public long getLength() {
            return getSidelength();
        }

        @Override
        public void setLength(long length) {
            setSidelength(length);
        }

        @Override
        public long getWidth() {
            return getSidelength();
        }

        @Override
        public void setWidth(long width) {
            setLength(width);
        }
    }

    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth()+1);
            log.info("width: {}, length: {}", rectangle.getWidth(), rectangle.getLength());
        }
        log.info("resize方法结束，width: {}, length: {}", rectangle.getWidth(), rectangle.getLength());
    }

    public static void main(String[] args) {
//        testRectangle();
        testSquare();
    }

    /** 长方形 */
    public static void testRectangle(){
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);
        resize(rectangle);
    }
    /** 正方形 */
    public static void testSquare(){
        Square square = new Square();
        square.setLength(10);
        resize(square);
    }
}
