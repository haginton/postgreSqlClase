package com.ada.postgresql.adaPostgreSqlClass.service;

import com.ada.postgresql.adaPostgreSqlClass.model.User;
import com.ada.postgresql.adaPostgreSqlClass.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public User findUserById(Long idUser) {
        return userRepository.findUserById(idUser);
    }

    @Override
    public User createUser(User user) {
        return userRepository.createUser(user);
    }

    @Override
    public Boolean updateUser(Long idUser, User user) {
        return userRepository.updateUser(idUser, user);
    }

    @Override
    public Boolean deleteUser(Long idUser) {
        return userRepository.deleteUser(idUser);
    }
}
