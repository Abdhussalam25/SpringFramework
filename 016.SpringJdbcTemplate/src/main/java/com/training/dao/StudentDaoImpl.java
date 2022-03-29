package com.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.training.bean.Student;
import com.training.bean.StudentMapper;

public class StudentDaoImpl implements StudentDao{
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	//1. Setting datasource for all db operations
	public void setDataSource(DataSource ds) {
		this.dataSource=ds;
		this.jdbcTemplate = new JdbcTemplate(this.dataSource);

	}

	//2. Adding new student record
	public void createStudent(int rollNumber, String studentName, String StudentStream, float avgMarks) {
		String sql="insert into student2 values(?,?,?,?)";
		jdbcTemplate.update(sql, rollNumber,studentName,StudentStream,avgMarks);
	System.out.println("Student Record has been created having rollNumber: " +rollNumber);	
	
	}

	//3. Showing all student information
	public List<Student> listStudents() {
		String sql="select * from student2";
		List <Student> students=new ArrayList<Student>();
		
		List<Student> listStudents = jdbcTemplate.query(sql, new StudentMapper());

	
		return listStudents;
	}

	//4. Showing perticuler student information by rollNumber
	public Student getStudentById(int rollNumber) {
		String sql="select * from student2 where rollNumber=?";
		Student student = jdbcTemplate.queryForObject(sql, new Object[] {rollNumber},new StudentMapper());
		
		
		return student;
	}

	//5. Modifying student information if given rollNumber exists
	public void updateStudent(int rollNumber, float avgMarks) {
		String sql="update student2 set avgmarks=? where rollnumber=?";
		jdbcTemplate.update(sql,avgMarks,rollNumber);

		System.out.println("Student Record has been modified havin roll number: " +rollNumber);
//		return student;
	}

	

	//6. Removing student information if given rollNumber exists
	public void deleteStudentById(int rollNumber) {
		String sql="delete from  student2 where rollnumber=?";
		
		
		jdbcTemplate.update(sql,rollNumber);

		System.out.println("Student Record has been deleted havin roll number: " +rollNumber);
//		return student;
		
	}

	
}
