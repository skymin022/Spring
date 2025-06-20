package com.aloha.spring_response.dto;

import lombok.Data;

@Data
public class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "aloha";
        this.age = 20;
    }
}
