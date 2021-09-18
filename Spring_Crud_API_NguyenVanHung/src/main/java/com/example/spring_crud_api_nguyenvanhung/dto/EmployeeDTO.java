package com.example.spring_crud_api_nguyenvanhung.dto;

import com.example.spring_crud_api_nguyenvanhung.entity.Employee;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)

public class EmployeeDTO {

    private String fullName;

    private String email;


    public EmployeeDTO(Employee origin) {
        this.fullName = origin.getFirstName() + " " + origin.getLastName();
        this.email = origin.getEmail();
    }
}