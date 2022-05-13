package com.example.userservicebackend.controller;

import com.example.userservicebackend.model.UserEntity;
import com.example.userservicebackend.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class UserController {
private final UserService userService;
    @GetMapping("/users")
    public ResponseEntity<List<UserEntity>> getAllUsers()
    {
        return ResponseEntity.ok(userService.getAllUsers());
    }
}
