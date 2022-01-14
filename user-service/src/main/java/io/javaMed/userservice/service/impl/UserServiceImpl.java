package io.javaMed.userservice.service.impl;


import io.javaMed.userservice.exception.ResourceNotFoundException;
import io.javaMed.userservice.model.User;
import io.javaMed.userservice.payload.user.UserProfile;
import io.javaMed.userservice.repository.UserRepository;
import io.javaMed.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;


    @Override
    public UserProfile getUserProfile(String username) {
        User user = userRepository.findByUserName(username).orElseThrow(()-> {
            return new ResourceNotFoundException("USER", "username", username);
        });
        Long postCount = restTemplate.getForObject("https://localhost:9001/count/" + user.getId(), Long.class);
        return new UserProfile(user.getId(),user.getUserName(), user.getName(), user.getCreatedAt(), postCount );

    }
}
