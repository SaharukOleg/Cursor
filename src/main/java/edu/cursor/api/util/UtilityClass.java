package edu.cursor.api.util;
import edu.cursor.api.Group;
import edu.cursor.api.Student;
import edu.cursor.api.Supervisor;

import java.util.List;
import java.util.Scanner;

public class UtilityClass {


    public void printStudents(List<Student> studentsList) {
        studentsList.forEach(student -> {
            System.out.println(student);
        });
    }

    public void printGroupStudents(List<Group> groups){
        System.out.println("vvedit nazvu gruppi");
        Scanner scanner = new Scanner(System.in);
        String nazvaGrupi = scanner.nextLine();
        for (Group x: groups) {
            if (x.getName().equals(nazvaGrupi)){
               // printStudents(x.getStudentList());
                System.out.println(x.getStudentList());
            }
        }
    }

    public  void printSuperGrup(List<Supervisor> supervisors){
        System.out.println("vvedit nazvu supervisor");
        Scanner scanner = new Scanner(System.in);
        String nameSupervisor = scanner.nextLine();
        for (Supervisor x : supervisors) {
            if (nameSupervisor.equals(x.getFirstName()))
            System.out.println(x.getGroup().getStudentList());
        }
    }


    }

