package com.hmily.basic.designmode.principle.demeter;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ErrorExample
 * @Description 迪米特原则的错误示例
 * 在Boss这个类的下达指令的方法里面，除开入参 ，出参， 还有类里面的成员变量，这些变量称为朋友，
 * 其他的都不能称为朋友，
 * 在下达指令的这个方法里面不应该和Course的这个类有任何的交互，
 * 这里就是违背了迪米特法则
 **/
@Slf4j
public class ErrorExample {

    static class TeamLeader {
        public void checkNumberOfCourses(List<Course> courseList) {
            log.info("在线课程的数量是: {}", courseList.size());
        }
    }

    static class Boss {
        public void commandCheckNumber(TeamLeader teamLeader) {
            List<Course> courseList = new ArrayList<>();
            for (int i = 0; i < 20; i++) {
                courseList.add(new Course());
            }
            teamLeader.checkNumberOfCourses(courseList);
        }
    }

    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }

}
