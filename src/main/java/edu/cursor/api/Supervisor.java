package edu.cursor.api;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Supervisor {
    private String firtsName;
    private String lastName;
    private String type;

    public Supervisor(String firtsName, String lastName, String type) {
        this.firtsName = firtsName;
        this.lastName = lastName;
        this.type = type;
    }


}
