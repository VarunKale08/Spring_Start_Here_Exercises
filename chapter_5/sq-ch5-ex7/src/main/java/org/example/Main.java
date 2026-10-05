package org.example;

import config.ProjectConfig;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import processor.CommentProcessor;
import services.CommentService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Comment comment = new Comment("Varun", "Hello World!");

        var commentService = context.getBean(CommentService.class);
//        CommentService commentService2 = context.getBean(CommentService.class);

        CommentProcessor cp1 = commentService.sendComment(comment);
        CommentProcessor cp2 = commentService.sendComment(comment);

        System.out.println(cp1 == cp2);
    }
}