package org.example;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.EmailService;
import services.JiraService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var service1 = context.getBean(EmailService.class);
        var service2 = context.getBean(JiraService.class);

        System.out.println(service1.getDatabaseRepository() == service2.getDatabaseRepository());
    }
}