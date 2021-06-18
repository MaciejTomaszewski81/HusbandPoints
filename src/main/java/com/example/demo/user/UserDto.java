package com.example.demo.user;

import org.springframework.stereotype.Component;


public class UserDto {

    private Long id;
    private String email;
    private Long points;

    public UserDto(Long id, String email, Long points) {
        this.id = id;
        this.email = email;
        this.points = points;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPoints() {
        return points;
    }

    public void setPoints(Long points) {
        this.points = points;
    }
}
