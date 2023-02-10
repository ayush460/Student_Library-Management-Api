package com.example.Students_Library_Managements.Service;

import com.example.Students_Library_Managements.Enums.CardStatus;
import com.example.Students_Library_Managements.Models.Card;
import com.example.Students_Library_Managements.Models.Student;
import com.example.Students_Library_Managements.Reposistory.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public String createStudent(Student student){
      Card card=new Card();
      card.setCardStatus(CardStatus.ACTIVATED);
      card.setStudentVariableName(student);
      student.setCard(card);
     studentRepository.save(student);
      return "student and card added successfully";
    }
}
