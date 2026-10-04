package org.example;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CommentService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var service1 = context.getBean("commentService", CommentService.class);
        var service2 =  context.getBean("commentService", CommentService.class);

        boolean b1 = service1 == service2;

        System.out.println(b1);
    }
}