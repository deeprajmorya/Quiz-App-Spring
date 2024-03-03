package com.deep.quizapp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String quiz_title;
    @ManyToMany
    private List<Question> questions;

    public void setTitle(String quiz_title ) {
        this.quiz_title = quiz_title;
    }
    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }


    public List<Question> getQuestions() {
        return questions;
    }
}
