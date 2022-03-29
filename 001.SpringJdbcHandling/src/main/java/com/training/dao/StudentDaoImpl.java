package com.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.training.bean.Student;

public class StudentDaoImpl implements StudentDao{
	private DataSource dataSource;

	//1. Setting datasource for all db operations
	public void setDataSource(DataSource ds) {
		this.dataSource=ds;

	}

	//2. Adding new student record
	public void createStudent(int rollNumber, String studentName, String StudentStream, float avtMarks) {
		String sql="insert into student2 values(?,?,?,?)";
		Connection connection=null;
		PreparedStatement pstmt=null;
		try {
			connection=dataSource.getConnection();
			pstmt=connection.prepareStatement(sql);
			pstmt.setInt(1, rollNumber);
			pstmt.setString(2, studentName);
			pstmt.setString(3, StudentStream);
			pstmt.setFloat(4, avtMarks);
			int i=pstmt.executeUpdate();
			if(i>0) {
				System.out.print("\nStudent record added in table successfully..");
			}else {
				System.err.print("\nStudent record not added in table..");
			}
		}catch(Exception e) {
			System.err.print("\n"+e.getMessage());
		}finally {
			try {
				pstmt.close();
				connection.close();
			}catch(SQLException se) {
				System.err.print("\n"+se.getMessage());
			}
		}
	}

	//3. Showing all student information
	public List<Student> getStudents() {
		String sql="select * from student2";
		Connection connection=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		Student student=null;
		List <Student> students=new ArrayList<Student>();
		try {
			connection=dataSource.getConnection();
			pstmt=connection.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				student=new Student();
				student.setRollNumber(rs.getInt(1));
				student.setStudentName(rs.getString(2));
				student.setStudentStream(rs.getString(3));
				student.setAvtMarks(rs.getFloat(4));
				students.add(student);
			}
		}catch(Exception e) {
			System.err.print("\n"+e.getMessage());
		}finally {
			try {
				pstmt.close();
				connection.close();
			}catch(SQLException se) {
				System.err.print("\n"+se.getMessage());
			}
		}
		return students;
	}

	//4. Showing perticuler student information by rollNumber
	public Student getStudentById(int rollNumber) {
		String sql="select * from student2 where rollNumber=?";
		Connection connection=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		Student student=null;
		try {
			connection=dataSource.getConnection();
			pstmt=connection.prepareStatement(sql);
			pstmt.setInt(1, rollNumber);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				student=new Student();
				student.setRollNumber(rs.getInt(1));
				student.setStudentName(rs.getString(2));
				student.setStudentStream(rs.getString(3));
				student.setAvtMarks(rs.getFloat(4));
			}
		}catch(Exception e) {
			System.err.print("\n"+e.getMessage());
		}finally {
			try {
				pstmt.close();
				connection.close();
			}catch(SQLException se) {
				System.err.print("\n"+se.getMessage());
			}
		}
		return student;
	}

	//5. Modifying student information if given rollNumber exists
	public Student updateStudent(int rollNumber, float avgMarks) {
		String sql="update student2 set avgmarks=? where rollnumber=?";
		Connection connection=null;
		PreparedStatement pstmt=null;
		Student student=null;
		try {
			connection=dataSource.getConnection();
			pstmt=connection.prepareStatement(sql);
			pstmt.setFloat(1, avgMarks);
			pstmt.setInt(2,rollNumber);
			int i=pstmt.executeUpdate();
			if(i>0) {
				System.out.print("\nStudent record modified in table successfully..");
			}else {
				System.err.print("\nStudent record not modified in table..");
			}
		}catch(Exception e) {
			System.err.print("\n"+e.getMessage());
		}finally {
			try {
				pstmt.close();
				connection.close();
			}catch(SQLException se) {
				System.err.print("\n"+se.getMessage());
			}
		}


		return student;
	}

	public Student updateStudent(int rollNumber, String studentName) {
		// TODO Auto-generated method stub
		return null;
	}

	public Student updateStudent(int rollNumber, String studentName, String studentStream) {
		// TODO Auto-generated method stub
		return null;
	}

	public Student updateStudent(int rollNumber, String studentName, String studentStream, float avgMarks) {
		// TODO Auto-generated method stub
		return null;
	}

	//6. Removing student information if given rollNumber exists
	public void deleteStudentById(int rollNumber) {
		String sql="delete from  student2 where rollnumber=?";
		Connection connection=null;
		PreparedStatement pstmt=null;
		Student student=null;
		try {
			connection=dataSource.getConnection();
			pstmt=connection.prepareStatement(sql);
			pstmt.setInt(1,rollNumber);
			int i=pstmt.executeUpdate();
			if(i>0) {
				System.out.print("\nStudent record deleted in table successfully..");
			}else {
				System.err.print("\nStudent record not deleted in table..");
			}
		}catch(Exception e) {
			System.err.print("\n"+e.getMessage());
		}finally {
			try {
				pstmt.close();
				connection.close();
			}catch(SQLException se) {
				System.err.print("\n"+se.getMessage());
			}
		}
	}
}
