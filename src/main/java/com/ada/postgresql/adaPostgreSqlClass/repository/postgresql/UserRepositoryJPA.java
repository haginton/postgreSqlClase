package com.ada.postgresql.adaPostgreSqlClass.repository.postgresql;

import com.ada.postgresql.adaPostgreSqlClass.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoryJPA extends JpaRepository<User, Long> {
}
