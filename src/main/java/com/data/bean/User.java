package com.data.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private long id;

    private String name;

    private String sex;

    private int age;

    public User() {

    }

    public User(long id, String name, String sex, int age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
}
