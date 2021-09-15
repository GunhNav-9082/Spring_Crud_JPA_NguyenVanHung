package com.example.spring_crud_api_nguyenvanhung;

import com.example.spring_crud_api_nguyenvanhung.entity.Employee;
import com.example.spring_crud_api_nguyenvanhung.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCrudApiNguyenVanHungApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCrudApiNguyenVanHungApplication.class, args);
    }
    //Save
    private void insertEmployees(EmployeeRepository repository){
        Employee employee = Employee.builder()
                .firstName("Van")
                .lastName("Hung")
                .email("chadkeeper2809@gmail.com")
                .build();
        repository.save(employee);
    }

    @Bean
    public CommandLineRunner run(EmployeeRepository repository) {
        return (args) -> {
            insertEmployees(repository);
            System.out.println(repository.findAll());
            System.out.println(repository.findEmployeeByLastName("Dat"));
        };
    }
}
