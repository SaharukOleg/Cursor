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

    private Supervisor supervisor;
    private List<Student> studentList;


    public Group(Supervisor supervisor, List<Student> studentList) {

        this.supervisor = supervisor;
        this.studentList = studentList;

    }



}

