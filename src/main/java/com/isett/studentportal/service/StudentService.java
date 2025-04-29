package com.isett.studentportal.service;
import com.isett.studentportal.model.Student;
import java.util.List;
import java.util.Optional;
public interface StudentService {
    List<Student> getAllStudents();
    Optional<Student> getStudentById(Long id);
    Student saveStudent(Student student);
    void deleteStudent(Long id);
}