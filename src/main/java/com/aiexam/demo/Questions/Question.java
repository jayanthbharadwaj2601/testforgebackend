package com.aiexam.demo.Questions;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Question {
    @Id
    @GeneratedValue
    public int id1;
    @Lob
    @Column(columnDefinition = "TEXT")
    public String Question;
    @Column
    public String username;
}
