package com.hmily.basic.designmode.principle.singleresponsibility.example2;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CourseImpl implements ICourseManager, ICourseContent {
    @Override
    public String getCourseName() {
        return "Java";
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {
        log.info("studying");
    }

    @Override
    public void refundCourse() {

    }
}
