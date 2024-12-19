package com.example.userlist;

import com.example.userlist.model.User;
import com.example.userlist.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final UserRepository userRepository;

    public DataLoader(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User();
        user1.setName("Ivan Ivanov");
        user1.setEmail("ivanivanov@mail.com");
        userRepository.save(user1);

        User user2 = new User();
        user2.setName("Petr Petrov");
        user2.setEmail("petrpetrov@email.com");
        userRepository.save(user2);
    }
}
