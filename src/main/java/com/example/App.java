package com.example;

import com.ui.ExamConsole;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public final class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(BaseConfig.class);
        context.refresh();
        // ExamConsole console = context.getBean(ExamConsole.class);
        ExamConsole console = (ExamConsole) context.getBean("console");
        
        console.print();

    }
}
 