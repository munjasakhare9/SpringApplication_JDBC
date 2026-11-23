package com.demo.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.dao.StudentDAO;
import com.demo.dao.impl.StudentDAOImpl;
import com.demo.entity.Student;

public class Tester {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		StudentDAO dao = context.getBean(StudentDAOImpl.class);
		Student s = new Student();
		s.setName("Jay Patil");
		s.setCity("Mumbai");
		s.setPerccentage(92.60);

		System.out.println(dao.insertStudent(s));
	}
}
