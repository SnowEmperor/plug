package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    

    public List<Employee> getAll(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Ivan Ivanov", "devops", 4000));
        employeeList.add(new Employee(2, "Sergey Sergeev", "java developer", 5000));
        employeeList.add(new Employee(3, "Oleg Orlov", "project manager", 6000));

        return employeeList;
    }

}
