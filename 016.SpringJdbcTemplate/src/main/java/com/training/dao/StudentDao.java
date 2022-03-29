package com.training.dao;

import java.util.List;

import javax.sql.DataSource;

import com.training.bean.Student;

public interface StudentDao {
	
	//1. Setting datasource for all db operations
	public void setDataSource(DataSource ds);
	
	//2. Adding new student record
	public void createStudent(int rollNumber, String studentName, String StudentStream,
	float avgMarks);
	
	//3. Showing all student information
	public List<Student> listStudents();
	
	//4. Showing perticuler student information by rollNumber
	public Student getStudentById(int rollNumber);
	
	//5. Modifying student information if given rollNumber exists
	public void updateStudent(int rollNumber,float avgMarks);
	
	
	//6. Removing student information if given rollNumber exists
	public void deleteStudentById(int rollNumber);
}
