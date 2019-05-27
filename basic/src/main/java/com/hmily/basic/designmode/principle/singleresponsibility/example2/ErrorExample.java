package com.hmily.basic.designmode.principle.singleresponsibility.example2;

/**
 * @ClassName ErrorExample
 * @Description 这个接口里面含有两个大块的功能：
 * 一个是获取课程的相关的信息，一个是对课程进行管理，可以进行拆分
 **/

public interface ErrorExample {
    /** 或者课程的相关的信息 */
    String getCourseName();
    byte[] getCourseVideo();

    /** 课程管理上的 */
    void studyCourse();
    void refundCourse();

}
