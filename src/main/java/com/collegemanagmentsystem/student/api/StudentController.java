package com.collegemanagmentsystem.student.api;

import com.collegemanagmentsystem.student.module.StudentModule;
import com.collegemanagmentsystem.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    //To get All data
    @GetMapping("/student")
    public List<StudentModule> getAllStudent() {

        return this.service.getAllStudent();
    }
    //Create the Data
    @PostMapping("/student")
    public StudentModule addStudent(@RequestBody StudentModule st)
    {
         this.service.addStudent(st);
         return (st);
    }

    //Delete the Data
    @DeleteMapping("/student/{id}")
    public String deleteStudentData(@PathVariable Long id) {
        this.service.deleteByID(id);
        return "Student Data Deleted Successfully !";
    }
}