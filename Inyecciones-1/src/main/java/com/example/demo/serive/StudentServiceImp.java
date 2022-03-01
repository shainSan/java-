package com.example.demo.serive;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Student.Student;

public class StudentServiceImp implements StudentService {
		private final List<Student> studentList = new ArrayList<Student>();
			public void add(Student student) {
				studentList.add(student);
			}

			public void delete(Student student) {
			     
			}

			public List<Student> all() {
				return studentList;
			      
			}

			public Student findById(String id) {
				return null;
		              
			}

		}
