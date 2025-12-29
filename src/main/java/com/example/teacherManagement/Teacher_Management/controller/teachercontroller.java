package com.example.teacherManagement.Teacher_Management.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.teacherManagement.Teacher_Management.model.teacher;
import com.example.teacherManagement.Teacher_Management.service.teacherservice;

@RestController
@RequestMapping("/teachers")
@CrossOrigin
public class teachercontroller {

    private final teacherservice service;

    public teachercontroller(teacherservice service) {
        this.service = service;
    }

    @PostMapping
    public teacher addTeacher(@RequestBody teacher t) {
        return service.addTeacher(t);
    }

    @GetMapping
    public List<teacher> getTeachers() {
        return service.getAllTeachers();
    }

    @PutMapping("/{id}")
    public teacher updateTeacher(@PathVariable Long id, @RequestBody teacher t) {
        return service.updateTeacher(id, t);
    }

    @DeleteMapping("/{id}")
    public void deleteTeacher(@PathVariable Long id) {
        service.deleteTeacher(id);
    }
}
