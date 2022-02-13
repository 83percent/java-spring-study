package com.ui;

import com.entity.Exam;

public class InlineExamConsole implements ExamConsole {
    private Exam exam;
    @Override
    public void setExam(Exam exam) {
        this.exam = exam;
        
    }
    @Override
    public void print() {
        System.out.printf("total : %d / avg : %f", exam.total(), exam.avg());
    }
}
