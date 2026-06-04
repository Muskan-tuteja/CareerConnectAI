package com.CareerConnect.userservice.service;

import com.CareerConnect.userservice.UserRepository;
import com.CareerConnect.userservice.dto.RegisterRequest;
import com.CareerConnect.userservice.dto.UserResponse;
import com.CareerConnect.userservice.models.User;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository repository;
    public UserResponse register(RegisterRequest request) {
        if(repository.existsByEmail(request.getEmail())){
            throw new RuntimeException("Email already exists");

        }
User user = new User();
user.setEmail(request.getEmail());
user.setPassword(request.getPassword());
user.setFirstname(request.getFirstname());
user.setLastname(request.getLastname());

User savedUser = new User();
UserResponse userResponse = new UserResponse();
        userResponse.setEmail(savedUser.getEmail());
        userResponse.setPassword(savedUser.getPassword());
        userResponse.setFirstname(savedUser.getFirstname());
        userResponse.setLastname(savedUser.getLastname());
        userResponse.setPassword(savedUser.getPassword());
        userResponse.setCreatedAt(savedUser.getCreatedAt());
        userResponse.setUpdatedAt(savedUser.getUpdatedAt());
        userResponse.setId(savedUser.getId());
return userResponse;
    }
}
