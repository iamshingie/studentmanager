package com.iamshingi.studentmanager.service;

import com.iamshingi.studentmanager.domain.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAllStudents();
    Student addNewStudent(Student student);
    Student updateStudent(Student student);
    void deleteStudent(Long id);
}
