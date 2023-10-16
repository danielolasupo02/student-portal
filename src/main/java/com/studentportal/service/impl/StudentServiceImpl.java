package com.studentportal.service.impl;

import com.studentportal.controller.StudentController;
import com.studentportal.entity.Student;
import com.studentportal.repository.StudentRepository;
import com.studentportal.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;


    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    // READ ALL STUDENTS SERVICE CODE BLOCK
    @Override
    public List<Student> getAllStudents() {

        return studentRepository.findAll();
    }

    // ADD STUDENT SERVICE CODE BLOCK
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    // UPDATE STUDENT SERVICE CODE BLOCK
    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }
}
