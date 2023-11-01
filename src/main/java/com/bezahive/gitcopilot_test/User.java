package com.bezahive.gitcopilot_test;


import jakarta.persistence.*;

@Entity
public class User {
    private String name;
    private int age;

    // generate @Id annotation
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    public User(String name, int age, int userId) {
        this.name = name;
        this.age = age;
        this.userId = userId;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getUserId() {
        return userId;
    }
}
