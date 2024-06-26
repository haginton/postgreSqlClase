package com.ada.postgresql.adaPostgreSqlClass.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long idUser;
    private String username;
    private String password;
    private String email;
    @Column(name = "date_creation")
    private LocalDateTime dateCreation;
    @Column(name = "date_update")
    private LocalDateTime dateUpdate;

    @OneToMany(mappedBy = "user")
    private List<Purchase> purchases;

    public User() {
        this.dateCreation = LocalDateTime.now();
    }

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.dateCreation = LocalDateTime.now();
        this.dateUpdate = null;
    }

    public Long getIdUser() {
        return idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public LocalDateTime getDateUpdate() {
        return dateUpdate;
    }

    public void updateUser(User user){
        setUsername(user.getUsername());
        setPassword(user.getPassword());
        setEmail(user.getEmail());
        this.dateUpdate = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", dateCreation=" + dateCreation +
                ", dateUpdate=" + dateUpdate +
                ", purchases=" + purchases +
                '}';
    }
}
