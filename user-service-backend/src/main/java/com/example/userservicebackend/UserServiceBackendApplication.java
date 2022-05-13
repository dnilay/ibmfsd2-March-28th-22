package com.example.userservicebackend;

import com.example.userservicebackend.model.UserEntity;
import com.example.userservicebackend.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@AllArgsConstructor
public class UserServiceBackendApplication {
private final UserRepository userRepository;
    public static void main(String[] args) {
        SpringApplication.run(UserServiceBackendApplication.class, args);
    }

    @PostConstruct
    public void loadData()
    {
        List<UserEntity> list=
                Stream.of(
                        new UserEntity("John","Doe","john@email.com"),
                        new UserEntity("Marry","Public","marry@email.com"),
                        new UserEntity("Steave","Jobs","steave@email.com"),
                        new UserEntity("Rahul","Dravid","rahul@email.com")
                ).collect(Collectors.toList());
        userRepository.saveAll(list);
    }
}
