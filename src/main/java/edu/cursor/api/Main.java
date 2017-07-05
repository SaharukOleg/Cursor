package edu.cursor.api;

import edu.cursor.api.util.UtilityClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Supervisor> supervisors = new ArrayList<>();
        Supervisor supervisor1 = new Supervisor("aa1", "aa2", "dasda");
        Supervisor supervisor2 = new Supervisor("aa1", "aa2", "dasda");
        Supervisor supervisor3 = new Supervisor("aa1", "aa2", "dasda");
        Supervisor supervisor4 = new Supervisor("aa1", "aa2", "dasda");
        supervisors.add(supervisor1);
        supervisors.add(supervisor2);

        Group group1 = new Group("aa", supervisor1, Arrays.asList(new Student("oleg", "sahkaruk", " loh"), new Student("aa", "aa", "stud"), new Student("bb", "bb", "stud"),new Student("cc", "cc", "stud")));
        Group group2 = new Group("bb", supervisor2, Arrays.asList(new Student("oleg", "sahkaruk", " loh"), new Student("dasda", "dasda", "stud"), new Student("dasda", "dasda", "stud")));
        Group group3 = new Group("cc", supervisor3, Arrays.asList(new Student("oleg", "sahkaruk", " loh"), new Student("dasda", "dasda", "stud"), new Student("dasda", "dasda", "stud")));
        Group group4 = new Group("gg", supervisor4, Arrays.asList(new Student("oleg", "sahkaruk", " loh"), new Student("dasda", "dasda", "stud"), new Student("dasda", "dasda", "stud")));

        supervisor1.setGroup(group1);

        ArrayList<Group> groupArrayList = new ArrayList<>();
        groupArrayList.add(group1);
        groupArrayList.add(group2);
        groupArrayList.add(group3);
        groupArrayList.add(group4);

        ArrayList<Student> studentArrayList = new ArrayList<>();

        UtilityClass utilityClass = new UtilityClass();
        utilityClass.printGroupStudents(groupArrayList);
        utilityClass.printSuperGrup(supervisors);


    }


}
