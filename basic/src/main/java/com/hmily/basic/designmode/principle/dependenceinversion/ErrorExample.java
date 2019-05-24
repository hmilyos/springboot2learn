package com.hmily.basic.designmode.principle.dependenceinversion;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName ErrorExample
 * @Description 错误示例
 * @Author hmily
 * @Date 2019/5/24 8:34
 **/
@Slf4j
public class ErrorExample {

    static class Tom{
//        v1
        public void studyJavaCourse(){
            log.info("tom 在学习 Java 课程");
        }

        public void studyFECourse(){
            log.info("tom 在学习 FE 课程");
        }

//        v2 如果这个时候，我还想要添加一个学习 Python 课程的方法，这个时候，我可以在基类里面进行添加方法：
        public void studyPyCourse(){
            log.info("tom 在学习 Python 课程");
        }
    }

    static  class Test{
        public static void main(String[] args) {
            Tom tom = new Tom();
//            v1
//            tom.studyJavaCourse();
//            tom.studyFECourse();

//            v2
            tom.studyPyCourse();
            /**
             * 以上我们的做法就是在面向实现来进行编程，
             * 面向实现类来进行编程的话， 扩展性比较的差，
             * 这个就是依赖于底层的实现的,
             * 现在我们来引入抽象来解决这个问题
             */

        }
    }

}
