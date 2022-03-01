package com.example.demo.serive;

import com.example.demo.model.Student.Student;
import com.example.demo.serive.StudentService;

import java.util.List;

public interface StudentService
{
    void add( Student student );

    void delete( Student student );

    List<Student> all();

    Student findById( String id );

}
