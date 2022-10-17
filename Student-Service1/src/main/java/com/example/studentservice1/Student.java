package com.example.studentservice1;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {
    private Long id;
    private String name;
    private int age;
}
