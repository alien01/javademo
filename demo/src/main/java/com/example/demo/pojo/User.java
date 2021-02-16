package com.example.demo.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class User {
    public Integer id;
    public String name;
    public Integer age;
}
