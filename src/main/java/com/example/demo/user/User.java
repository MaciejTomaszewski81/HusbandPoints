package com.example.demo.user;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Setter
@Getter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String password;

    private String email;

    private Long points;

    private String nick;

    @OneToMany(mappedBy = "user")
    private Set<UserRole> roles;

}
