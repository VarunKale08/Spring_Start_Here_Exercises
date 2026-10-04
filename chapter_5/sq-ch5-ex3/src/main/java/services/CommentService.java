package services;

import org.springframework.stereotype.Service;

@Service
public class CommentService {

    public CommentService(){
        System.out.println("Comment Service ojbect instanstiated using eager instantiation.");
    }
}
