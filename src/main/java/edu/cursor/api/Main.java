package edu.cursor.api;

import edu.cursor.api.util.UtilityClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Group group0 = new Group(new Supervisor("saa","sdasd","super"),Arrays.asList(new Student("dasdas","adsada","stud"),new Student("vitalii", "dsadas", "student"), new Student("dsada", "dasdas", "student")));

        Group group1 = new Group(new Supervisor("volodya", "sdadasd", "supervisor"), Arrays.asList(new Student("vitalik", "dasda", "student"), new Student("vitalii", "dsadas", "student"), new Student("dsada", "dasdas", "student")));

        Group group2 = new Group(new Supervisor("vasil", "sdadasd", "supervisor"), Arrays.asList(new Student("vitalik", "dasda", "student"), new Student("vitalii", "dsadas", "student"), new Student("dsada", "dasdas", "student")));

        Group group3 = new Group(new Supervisor("vadim", "sdadasd", "supervisor"), Arrays.asList(new Student("vitalik", "dasda", "student"), new Student("vitalii", "dsadas", "student"), new Student("dsada", "dasdas", "student")));

        UtilityClass utilityClass = new UtilityClass();

        List<Student> list = new ArrayList<>();
        list.addAll(group0.getStudentList());
        list.addAll(group1.getStudentList());
        list.addAll(group2.getStudentList());
        list.addAll(group3.getStudentList());
        utilityClass.printAllStudents(list);

        System.out.println("dasdada");
        System.out.println("dasdada");
        System.out.println("dasdada");
        System.out.println("dasdada");
        System.out.println("dasdada");
        System.out.println("dasdada");
        System.out.println("dasdada");
        System.out.println("dasdada");
        System.out.println("dasdada");
        System.out.println("dasdada");
        System.out.println("dasdada");
        System.out.println("dasdada");
        System.out.println("dasdada");
        System.out.println("dasdada");


    }


}
