package org.example.studnetloginsystem.weblayer;

import org.example.studnetloginsystem.persistancelayer.Student;
import org.example.studnetloginsystem.servicelayer.LoginService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class Controoler {

    @Autowired
    private LoginService loginService;

    @GetMapping("/login")
    String showLoginPage() {
        return "login";
    }

    @GetMapping("/logindata")
    public String LoginUser(@RequestParam("email") String email, @RequestParam("password") String password, Map<String, Object> model) {
        Student student = loginService.login(email, password);
        model.put("student", student);
        return "showdata";
    }



    @GetMapping("/register")
    String showRegisterPage() {
        return "register";
    }

    @PostMapping("/register")
    @ResponseBody
    String registerStudent(@ModelAttribute("studentFormData") StudentFormData studentFormData) {
        return loginService.createAccount(new Student(studentFormData.getName(), studentFormData.getEmail(), studentFormData.getPassword()));
    }

    @GetMapping("/home")
    public String showHomePage() {
        return "home";
    }

}
