package com.ada.postgresql.adaPostgreSqlClass.repository;

import com.ada.postgresql.adaPostgreSqlClass.model.User;

import java.util.List;

public interface UserRepository {
    List<User> getAllUsers();
    User findUserById(Long idUser);
    User createUser(User user);
    Boolean updateUser(Long idUser, User user);
    Boolean deleteUser(Long idUser);
}
