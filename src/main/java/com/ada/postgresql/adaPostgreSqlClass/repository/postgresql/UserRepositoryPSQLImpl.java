package com.ada.postgresql.adaPostgreSqlClass.repository.postgresql;

import com.ada.postgresql.adaPostgreSqlClass.model.User;
import com.ada.postgresql.adaPostgreSqlClass.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryPSQLImpl implements UserRepository {

    @Autowired
    private UserRepositoryJPA userRepositoryJPA;

    @Override
    public List<User> getAllUsers() {
        return userRepositoryJPA.findAll();
    }

    @Override
    public User findUserById(Long idUser) {
        return userRepositoryJPA.findById(idUser).get();
    }

    @Override
    public User createUser(User user) {
        return userRepositoryJPA.save(user);
    }

    @Override
    public Boolean updateUser(Long idUser, User user) {
        User userFound = findUserById(idUser);
        if (userFound != null){
            userFound.updateUser(user);
            return true;
        }
        return false;
    }

    @Override
    public Boolean deleteUser(Long idUser) {
        User userFound = findUserById(idUser);
        if (userFound != null){
            userRepositoryJPA.delete(userFound);
            return true;
        }
        return false;
    }
}
