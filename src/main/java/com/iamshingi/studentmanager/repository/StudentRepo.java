package com.iamshingi.studentmanager.repository;

import com.iamshingi.studentmanager.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepo extends JpaRepository<Student, Long> {
    void deleteStudentById(Long id);
    Optional<Student> findStudentById(Long id);
}
