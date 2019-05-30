package com.hmily.basic.designmode.principle.openclose;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class Test {

    public static void main(String[] args) {
//        test1();
        test2();
    }

    public static void test1(){
        ICourse javaCourse = new JavaCourse(1, "Java 基础", 96D);
        log.info("课程id: {}, 课程名称: {}, 价格：{}", javaCourse.getId(), javaCourse.getName(), javaCourse.getPrice());
    }


    public static void test2(){
        JavaDiscountCourse javaDiscountCourse = new JavaDiscountCourse(1, "Java 基础", 96D, 80D);
        log.info("课程id: {}, 课程名称: {}, 原价: {}, 打折: {}%, 折后售价：{}", javaDiscountCourse.getId(), javaDiscountCourse.getName(),
                javaDiscountCourse.getOriginPrice(), javaDiscountCourse.getRatio(), javaDiscountCourse.getDiscountPrice());
    }

}
