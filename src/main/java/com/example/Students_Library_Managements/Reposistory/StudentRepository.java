package com.example.Students_Library_Managements.Reposistory;

import com.example.Students_Library_Managements.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
