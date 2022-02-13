package com.example;

import com.entity.Exam;
import com.entity.NewlecExam;
import com.ui.ExamConsole;
import com.ui.GridExamConsole;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ui")
public class BaseConfig {
    @Bean
    public ExamConsole console() {
        return new GridExamConsole();
    }

    @Bean
    public Exam exam() {
        return new NewlecExam();
    }
}
