package com.hmily.basic.designmode.principle.demeter;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Example
 * @Description
 * Boss的这个类是不需要了解Course的这个类
 * 和Course这个类直接发生关系的是TeamLeader的这个类;
 **/

@Slf4j
public class Example {

    static class TeamLeader {
        public void checkNumberOfCourses() {
            List<Course> courseList = new ArrayList<>();
            for (int i = 0; i < 20; i++) {
                courseList.add(new Course());
            }
            log.info("在线课程的数量是: {}", courseList.size());
        }
    }

    static class Boss {
        public void commandCheckNumber(TeamLeader teamLeader) {
            teamLeader.checkNumberOfCourses();
        }
    }

    public static void main(String[]args){
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }

}
