package com.hmily.basic.designmode.principle.dependenceinversion;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName JavaCourse
 * @Description TODO
 * @Author hmily
 * @Date 2019/5/24 8:43
 **/
@Slf4j
public class FECourse implements ICourse {
    @Override
    public void studyCourse(String name) {
        log.info("{} 在学习 FE 课程", name);
    }
}
