package com.CareerConnect.userservice.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterRequest {
    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String firstname;
    private String lastname;
    private String email;
    @NotBlank(message = "Password is requried")
    @Size(min = 6, message = "Password must have atLeast 6 Character")
    private String password;
}
