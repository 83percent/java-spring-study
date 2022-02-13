package com.entity;

import org.springframework.stereotype.Component;

@Component("exam2")
public class NewlecExam implements Exam {
    private int kor, eng, com, math;

    public void setCom(int com) {
        this.com = com;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setMath(int math) {
        this.math = math;
    }
    
    @Override
    public int total() {
        return kor + eng + com + math;
    }
    @Override
    public float avg() {
        return this.total() / 4f;
    }
}
