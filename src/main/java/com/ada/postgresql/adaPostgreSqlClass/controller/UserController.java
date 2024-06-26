package com.ada.postgresql.adaPostgreSqlClass.controller;

import com.ada.postgresql.adaPostgreSqlClass.model.User;
import com.ada.postgresql.adaPostgreSqlClass.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }


    @GetMapping("/{idUser}")
    public ResponseEntity<User> findUserById(@PathVariable("idUser") Long idUser) {
        return new ResponseEntity<>(userService.findUserById(idUser), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return new ResponseEntity<>(userService.createUser(user), HttpStatus.CREATED);
    }


    @PutMapping("/{idUser}")
    public ResponseEntity<Boolean> updateUser(@PathVariable("idUser") Long idUser, @RequestBody User user) {
        return new ResponseEntity<>(userService.updateUser(idUser, user), HttpStatus.OK);
    }


    @DeleteMapping("/{idUser}")
    public ResponseEntity<Boolean> deleteUser(@PathVariable("idUser") Long idUser) {
        return new ResponseEntity<>(userService.deleteUser(idUser), HttpStatus.OK);
    }
}
