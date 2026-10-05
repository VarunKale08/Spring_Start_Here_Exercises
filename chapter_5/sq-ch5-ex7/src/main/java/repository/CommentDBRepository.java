package repository;

import model.Comment;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentDBRepository implements DBRepository {
//    private Comment comment;


    @Override
    public void saveComment(Comment comment) {
        System.out.println("Coment Saved!" + comment);
    }
}
