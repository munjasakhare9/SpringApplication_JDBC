package com.demo.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.demo.dao.StudentDAO;
import com.demo.entity.Student;

public class StudentDAOImpl implements StudentDAO {
	private JdbcTemplate j;

	public void setJ(JdbcTemplate j) {
		this.j = j;
	}

	public int insertStudent(Student s) {
		int check = 0;

		String sql = "insert into student(name, city, percentage) values(?,?,?)";
		check = j.update(sql, new Object[] { s.getName(), s.getCity(), s.getPerccentage() });
		return check;
	}

}
