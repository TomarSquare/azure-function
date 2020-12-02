package com.cts.azure.function.service;

import com.cts.azure.function.domains.User;
import com.cts.azure.function.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        userRepository.save(user);
        return user;
    }

    public User getUserById(Integer id) {
        User fecthedUser = userRepository.findById(id).get();
        return fecthedUser;
    }
}
