package net.skhu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.skhu.domain.Department;
import net.skhu.domain.Student;
import net.skhu.repository.DepartmentRepository;
import net.skhu.repository.StudentRepository;

@RestController
public class APIController {

    @Autowired StudentRepository studentRepository;
    @Autowired DepartmentRepository departmentRepository;

    @RequestMapping("students")
    public List<Student> students() {
        return studentRepository.findAll();
    }

    @RequestMapping("departments")
    public List<Department> departments() {
        return departmentRepository.findAll();
    }
}
