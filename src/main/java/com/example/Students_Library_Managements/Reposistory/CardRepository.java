package com.example.Students_Library_Managements.Reposistory;

import com.example.Students_Library_Managements.Models.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card,Integer> {
}
