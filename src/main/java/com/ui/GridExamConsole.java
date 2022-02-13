package com.ui;

import com.entity.Exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GridExamConsole implements ExamConsole {
    private Exam exam;

    @Autowired
    @Override
    public void setExam(Exam exam) {
        this.exam = exam;
    }

    @Override
    public void print() {
        System.out.println("|   total   |   avg   |");
        System.out.printf("|   %d   |   %f   |", exam.total(), exam.avg());
    }
}
