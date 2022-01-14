package io.javaMed.userservice.service;

import io.javaMed.userservice.payload.user.UserProfile;

public interface UserService {
    UserProfile getUserProfile(String username);
}
