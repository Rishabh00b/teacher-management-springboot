package com.example.teacherManagement.Teacher_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.teacherManagement.Teacher_Management.model.teacher;

public interface teacherrepo extends JpaRepository<teacher, Long> {
}
