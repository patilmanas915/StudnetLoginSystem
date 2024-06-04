package org.example.studnetloginsystem.persistancelayer;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Student {

    @Id
    private String id;
    private String name;
    private String email;
    private String password;

    public Student(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
