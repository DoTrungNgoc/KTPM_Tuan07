package com.example.studentservice;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    private RestTemplate restTemplate = new RestTemplate();
    private String url = "http://localhost:8080/crud";

    public List<Student> getAll(){
       ResponseEntity<Student[]> response =  restTemplate.getForEntity(url,Student[].class);
       return Arrays.asList(response.getBody());
    }

    public Student create(Student student) {
        return restTemplate.postForObject(url,student,Student.class);
    }


}
