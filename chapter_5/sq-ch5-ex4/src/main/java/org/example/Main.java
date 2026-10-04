package org.example;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("CommentService bean is not instantiated at context startup due to @Lazy, even though its bean definition is registered in the context.");

        var commentService = context.getBean(CommentService.class);

        System.out.println("CommentService bean was instantiated during the getBean() call, proving @Lazy defers creation until first request.");
    }
}