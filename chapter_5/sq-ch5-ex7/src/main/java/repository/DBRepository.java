package repository;

import model.Comment;

public interface DBRepository {

    void saveComment(Comment comment);
}
