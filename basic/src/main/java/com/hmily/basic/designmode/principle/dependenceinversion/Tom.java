package com.hmily.basic.designmode.principle.dependenceinversion;

/**
 * @ClassName Tom
 * @Description 初级的调用方式
 * @Author hmily
 * @Date 2019/5/24 8:46
 **/
public class Tom {
    public void studyCourse(ICourse course){
        course.studyCourse("Tom");
    }


    public static void main(String[] args) {
        Tom tom = new Tom();
        tom.studyCourse(new JavaCourse());
        tom.studyCourse(new FECourse());

        tom.studyCourse(new PythonCourse());
    }
}
