package io.javaMed.userservice.service;


import io.javaMed.userservice.model.User;
import io.javaMed.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User saveUser(User user) {
        return userRepository.save(user);
    }


    public User findByUserId(Long userId) {
        return userRepository.findByUserId(userId);

    }
}
