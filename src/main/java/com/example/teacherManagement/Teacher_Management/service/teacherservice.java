package com.example.teacherManagement.Teacher_Management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.teacherManagement.Teacher_Management.model.teacher;
import com.example.teacherManagement.Teacher_Management.repository.teacherrepo;

@Service
public class teacherservice {

    private final teacherrepo repo;

    public teacherservice(teacherrepo repo) {
        this.repo = repo;
    }

    public teacher addTeacher(teacher t) {
        return repo.save(t);
    }

    public List<teacher> getAllTeachers() {
        return repo.findAll();
    }

    public teacher updateTeacher(Long id, teacher t) {
        teacher existing = repo.findById(id).orElseThrow();
        existing.setName(t.getName());
        existing.setSubject(t.getSubject());
        return repo.save(existing);
    }

    public void deleteTeacher(Long id) {
        repo.deleteById(id);
    }
}
