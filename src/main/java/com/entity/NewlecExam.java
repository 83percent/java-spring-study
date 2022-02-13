package com.entity;

public class NewlecExam implements Exam {
    private int kor, eng, com, math;

    @Override
    public int total() {
        return kor + eng + com + math;
    }
    @Override
    public float avg() {
        return this.total() / 4f;
    }
}
