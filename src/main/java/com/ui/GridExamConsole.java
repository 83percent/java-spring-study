package com.ui;

import com.entity.Exam;

public class GridExamConsole implements ExamConsole {
    private Exam exam;
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
