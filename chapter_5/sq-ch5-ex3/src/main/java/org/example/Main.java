package org.example;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // constructer insde the commentservice will be executed as soon as the projectconfig is given to spring context
        // as commentService is a bean which is part of the spring context it will execute as spring contex is defined
        // which is part of eager instantiation
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
    }
}