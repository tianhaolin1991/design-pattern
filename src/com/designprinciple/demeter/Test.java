package com.designprinciple.demeter;

import com.designprinciple.demeter.undo.Boss;
import com.designprinciple.demeter.undo.TeamLeader;

public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCourseCount(teamLeader);
    }
}
