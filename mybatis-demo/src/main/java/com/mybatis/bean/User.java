package com.mybatis.bean;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private Integer age;
    private String name;

    public User(Integer id, Integer age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
