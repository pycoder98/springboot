package com.collegemanagmentsystem.student.jpa;

import com.collegemanagmentsystem.student.module.StudentModule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentModule,Long> {



}
