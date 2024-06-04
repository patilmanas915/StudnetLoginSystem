package org.example.studnetloginsystem.persistancelayer;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface Studentdao extends MongoRepository<Student, String>{
    public Optional<Student> findByEmailAndPassword(String email, String password);

}
