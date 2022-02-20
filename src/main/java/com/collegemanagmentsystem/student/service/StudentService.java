package com.collegemanagmentsystem.student.service;

import com.collegemanagmentsystem.student.jpa.StudentRepository;
import com.collegemanagmentsystem.student.module.StudentModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    //To create a Data
    public void addStudent(StudentModule st)
    {
        repo.save(st);
        System.out.println("Student Data Created Successfully!!!!");
    }

    //toget all data
    public List<StudentModule> getAllStudent() {
        return repo.findAll();
    }

    //To delete by id
    public void deleteByID(Long id)
    {
        this.repo.deleteById(id);
        System.out.println("Student Data Deleted Successfully!!!!");
    }
}
