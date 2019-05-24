package com.hmily.basic.designmode.principle.dependenceinversion;

/**
 * @ClassName Tom
 * @Description 更好的调用方式
 * @Author hmily
 * @Date 2019/5/24 8:46
 **/
public class Tom2 {

    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyCourse(){
        iCourse.studyCourse("Tom");
    }


    public static void main(String[] args) {
        Tom2 tom = new Tom2();
        tom.setiCourse(new JavaCourse());
        tom.studyCourse();

        tom.setiCourse(new FECourse());
        tom.studyCourse();
    }
}
