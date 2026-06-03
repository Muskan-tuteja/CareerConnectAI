package com.CareerConnect.userservice.controller;


import com.CareerConnect.userservice.dto.RegisterRequest;
import com.CareerConnect.userservice.dto.UserResponse;
import com.CareerConnect.userservice.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserController {
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserResponse> register(
            @RequestBody RegisterRequest request) {

        return ResponseEntity.ok(userService.register(request));
    }
}
