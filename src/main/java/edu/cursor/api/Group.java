package edu.cursor.api;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;


@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Group {
    private String name;
    private Supervisor supervisor;
    private List<Student> studentList;

    public Group(String name, Supervisor supervisor, List<Student> studentList) {
        this.name = name;
        this.supervisor = supervisor;
        this.studentList = studentList;
    }


}




