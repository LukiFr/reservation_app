package com.example.database_service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class UsersController {

    private final UsersRepository usersRepository;

    public UsersController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Users createTodo(@RequestBody Users users) {
        return usersRepository.save(users);
    }

    @GetMapping("/")
    public Iterable<Users> getTodos() {
        return usersRepository.findAll();
    }
}