package com.demo.dao.impl;

import java.util.List;

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

	public int deleteStudentById(int id) {
		String sql = "delete from student where id = ?";
		return j.update(sql, id);
	}

	public List<Student> displayAllStudent() {
		String sql = "select * from student";
		List<Student> list = j.query(sql, new StudentRowMapper());
		return list;
	}

	public Student findStudentById(int id) {
		String sql = "select * from Student where id=?";
		return j.queryForObject(sql, new StudentRowMapper(), id);
	}

	public Student findStudentById2(int id) {
		String sql = "select * from Student where id=?";
		List<Student> list = j.query(sql, new StudentRowMapper(), id);
		return (!list.isEmpty()) ? list.get(0) : null;
	}
}
