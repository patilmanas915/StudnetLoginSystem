package org.example.studnetloginsystem.servicelayer;

import org.example.studnetloginsystem.persistancelayer.Student;
import org.example.studnetloginsystem.persistancelayer.Studentdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class LoginService implements ILoginService{

    @Autowired
    private Studentdao studentdao;

    @Override
    public String createAccount(Student student) {
        return studentdao.save(student).getEmail()+" created";

    }

    @Override
    public Student login(String email, String password) {
        System.out.println(email);
        System.out.println(password);
        Optional<Student> stu = studentdao.findByEmailAndPassword(email, password);
        if(stu.isPresent()){
            return stu.get();
        }
        return new Student("null","null","null");
    }
}
