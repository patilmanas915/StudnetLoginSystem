package org.example.studnetloginsystem;

import org.example.studnetloginsystem.persistancelayer.Student;
import org.example.studnetloginsystem.servicelayer.ILoginService;
import org.example.studnetloginsystem.servicelayer.LoginService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StudnetLoginSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudnetLoginSystemApplication.class, args);
    }

}
