package edu.cursor.api.util;

import edu.cursor.api.Student;
import edu.cursor.api.Supervisor;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Scanner;

@NoArgsConstructor
public class UtilityClass {


    public void printAllStudents(List<Student> studentsList) {
        studentsList.forEach(student -> {
            System.out.println(student);
        });
    }

}
