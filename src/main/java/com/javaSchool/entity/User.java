package com.javaSchool.entity;

import com.javaSchool.entity.enums.Role;
import jakarta.persistence.*;
import lombok.Data;

// User of the app - Doctor or Nurse

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;


    @Column(name = "user_name")
    private String userName;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "role")
    private Role role;
}
