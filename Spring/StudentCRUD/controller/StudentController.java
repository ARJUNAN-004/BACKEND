package com.example.StudentCRUD.controller;

import com.example.StudentCRUD.model.Student;
import com.example.StudentCRUD.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudentbyid(@PathVariable("id") int id) {
        return studentService.getStudentbyid(id);}

    @PostMapping(path="/students")
    public String addstudent(@RequestBody Student student){
        studentService.addstudent(student);
        return "Student added successfully";
    }
    @PutMapping("/students")
    public String updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }
    @PutMapping("/students/{id}")
    public String updateStudentbyid(@PathVariable("id") int id,@RequestBody Student student) {
        student.setId(id);
        return studentService.updatestudentbyid(id, student);
    }
}
