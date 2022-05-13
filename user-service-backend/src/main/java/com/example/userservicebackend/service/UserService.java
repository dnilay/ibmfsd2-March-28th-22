package com.example.userservicebackend.service;

import com.example.userservicebackend.model.UserEntity;

import java.util.List;

public interface UserService {

    List<UserEntity> getAllUsers();
}
