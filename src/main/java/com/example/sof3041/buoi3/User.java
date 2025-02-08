package com.example.sof3041.buoi3;

public class User {
    //Bài 5
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        if (name == null) {
            throw new NullPointerException("Tên không được null");
        }
        return name;
    }
}
