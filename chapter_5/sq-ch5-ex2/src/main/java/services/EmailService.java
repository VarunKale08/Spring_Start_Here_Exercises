package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.DatabaseRepository;

@Service
public class EmailService {

    @Autowired
    private DatabaseRepository databaseRepository;


    public DatabaseRepository getDatabaseRepository() {
        return databaseRepository;
    }
}
