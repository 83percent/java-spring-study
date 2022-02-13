package com.example;

import com.ui.ExamConsole;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public final class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/example/setting.xml");
        ExamConsole console = context.getBean(ExamConsole.class);
        console.print();

    }
}
 