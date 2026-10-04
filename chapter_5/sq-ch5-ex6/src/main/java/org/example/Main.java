package org.example;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.EmailNotificationService;
import services.JiraNotificationService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var emailNotification = context.getBean(EmailNotificationService.class);
        var jiraNotitification = context.getBean(JiraNotificationService.class);

        boolean b1 = emailNotification.getCommentRepository() == jiraNotitification.getCommentRepository();

        System.out.println(b1);

    }
}