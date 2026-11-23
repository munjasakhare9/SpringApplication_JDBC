package com.demo.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.dao.StudentDAO;
import com.demo.dao.impl.StudentDAOImpl;
import com.demo.entity.Student;

public class Tester {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		StudentDAO dao = context.getBean(StudentDAOImpl.class);

		// insert student

		/*
		 * Student s = new Student(); s.setName("Shrikant Patil"); s.setCity("Kanpur");
		 * s.setPerccentage(70.20);
		 * 
		 * System.out.println(dao.insertStudent(s));
		 */

		// delete student where id = 2;

		// System.out.println(dao.deleteStudentById(2));

		// display all student

		List<Student> students = dao.displayAllStudent();
		for (Student s : students) {
			System.out.println(s.getId() + "--" + s.getName() + "--" + s.getCity() + "--" + s.getPerccentage());
		}

		// students.forEach(System.out::println);
	}
}
