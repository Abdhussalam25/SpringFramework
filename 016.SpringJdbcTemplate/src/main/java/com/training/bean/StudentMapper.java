package com.training.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMapper  implements RowMapper<Student>{

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student student =  new Student();

		student.setRollNumber(rs.getInt("rollNumber"));
		student.setStudentName(rs.getString("studentName"));
		student.setStudentStream(rs.getString("studentStream"));
		student.setAvgMarks(rs.getFloat("avgMarks"));
		
		
		
		
		
		return student;
	}

}
