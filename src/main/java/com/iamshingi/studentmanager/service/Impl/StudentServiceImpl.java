package com.iamshingi.studentmanager.service.Impl;

import com.iamshingi.studentmanager.domain.Student;
import com.iamshingi.studentmanager.exception.StudentNotFoundException;
import com.iamshingi.studentmanager.repository.StudentRepo;
import com.iamshingi.studentmanager.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepo studentRepo;

    public StudentServiceImpl(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public List<Student> findAllStudents() {
        return studentRepo.findAll();
    }

    public Student findStudentById(Long id){
        return studentRepo.findStudentById(id).orElseThrow(()-> new StudentNotFoundException("Student with id" + "was not found")) ;
    }

    @Override
    public Student addNewStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepo.deleteStudentById(id);

    }
}
