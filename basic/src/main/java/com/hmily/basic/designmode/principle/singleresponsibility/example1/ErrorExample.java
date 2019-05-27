package com.hmily.basic.designmode.principle.singleresponsibility.example1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

/**
 * @ClassName ErrorExample
 * @Description 单一职责原则错误示例
 * @Author hmily
 * @Date 2019/5/27 8:56
 **/

@Slf4j
public class ErrorExample {

    static class Bird{
        public void mainMoveMode(String birdName){
            if ("鸵鸟".equals(birdName)) {
                log.info("{} 用脚走路", birdName);
                return;
            }
            log.info("{} 用翅膀飞", birdName);
        }
    }

    static class Test{
        public static void main(String[] args) {
            Bird bird = new Bird();
            bird.mainMoveMode("大雁");
            bird.mainMoveMode("鸵鸟");
        }
    }
}
