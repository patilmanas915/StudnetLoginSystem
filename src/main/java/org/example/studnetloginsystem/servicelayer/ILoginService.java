package org.example.studnetloginsystem.servicelayer;

import org.example.studnetloginsystem.persistancelayer.Student;

public interface ILoginService {
    public String createAccount(Student student);
    public Student login(String email, String password);
}
