package com.example.studentservice;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {
    private Long id;
    private String name;
    private int age;
}
