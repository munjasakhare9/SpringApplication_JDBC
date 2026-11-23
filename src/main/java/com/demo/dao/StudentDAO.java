package com.demo.dao;

import java.util.List;

import com.demo.entity.Student;

public interface StudentDAO {
	public int insertStudent(Student s);

	public int deleteStudentById(int id);

	public List<Student> displayAllStudent();

	public Student findStudentById(int id);
}
