package com.example.department_service.controller;

import com.example.department_service.entity.Department;
import com.example.department_service.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentRepository departmentRepository;

    @PostMapping
    public Department saveDepartment(@RequestBody Department department) {
        return departmentRepository.save(department);
    }

    @GetMapping("/{id}")
    public Department getDepartment(@PathVariable Long id) {
        return departmentRepository.findById(id).orElse(null);
    }
}
