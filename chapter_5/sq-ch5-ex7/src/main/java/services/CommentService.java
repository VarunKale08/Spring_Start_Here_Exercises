package services;

import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import processor.CommentProcessor;

@Service
public class CommentService {

    @Autowired
   private ApplicationContext context;


    public CommentProcessor sendComment(Comment comment) {
        CommentProcessor commentProcessor = context.getBean(CommentProcessor.class);
        commentProcessor.setComment(comment);
        commentProcessor.getComment();
        commentProcessor.processComment();

        return commentProcessor;
    }




}
