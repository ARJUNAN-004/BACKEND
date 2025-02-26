package com.example.StudentCRUD.service;

import com.example.StudentCRUD.model.Student;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    List<Student> students=new ArrayList<>(Arrays.asList(
            new Student(1,"Arjun","Java"),
            new Student(2,"sanjay","Python"),
            new Student(3,"kavin","C++")
    ));
    public List<Student> getStudents() {
        return students;
    }

    public Student getStudentbyid(int id) {
        return students.stream().filter(e->e.getId()==id).findFirst().get();
    }  
    public void addstudent(Student student) {
        students.add(student);
    }

    public String updateStudent( Student student) {
        int id=0,flag=0;
        for(Student s:students){
            if(s.getId()==student.getId()){
                flag=1;
                break;
            }
            id++;
        }
        if (flag==1){
            students.set(id,student);
            return "Student updated successfully";
        }
        else{
            return "Student not found";
        }
    }
    public String updatestudentbyid(int id, Student student) {
        id=0;
        int flag=0;
        for(Student s:students){
            if(s.getId()==student.getId()){
                flag=1;
                break;
            }
            id++;
        }
        if (flag==1){
            students.set(id,student);
            return "Student updated successfully";
        }
        else{
            return "Student not found";
        }
    }
}
