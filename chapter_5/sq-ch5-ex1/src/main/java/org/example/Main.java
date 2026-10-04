package org.example;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var commentSerice1 = context.getBean("service1", CommentService.class);
        var commentSerice2 = context.getBean("service2", CommentService.class);

        boolean b1 = commentSerice1 == commentSerice2;

        System.out.println(b1);
    }
}