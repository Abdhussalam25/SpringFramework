package com.training.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.bean.Student;
import com.training.dao.StudentDao;

/**
 * salambashaallabahas@gmail.com
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int choice;
        int rollNumber;
        String studentName,studentStream;
        float avgMarks;
        
        Scanner sc = new Scanner(System.in);
        
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
    	
        StudentDao studentdao = (StudentDao) context.getBean("studentdao");
    	
        do {
        	
        	System.out.println("1. Press 1 for add student");
        	System.out.println("2. Press 2 for show All student");
        	System.out.println("3. Press 3 for show student By RollNumber");
        	System.out.println("4. Press 4 for modify student By RollNumber");
        	System.out.println("5. Press 5 for delete student by RollNumber");
        	System.out.println("6. Press 0 for exit from application");
        	System.out.println("Enter Your choice( 0  to 5 )");
            choice = sc.nextInt();
        	switch(choice) {
        	case 1:
        	
        		System.out.println("Enter the rollNumber");
        		rollNumber = sc.nextInt();
        		System.out.println("Enter Student Name:");
        		studentName = sc.next();
        		System.out.println("Enter the Student Stream:");
        		studentStream = sc.next();
        		System.out.println("Enter Student AvgMarks:");
        		avgMarks = sc.nextFloat();
        		studentdao.createStudent(rollNumber, studentName, studentStream, avgMarks);
        		break;   
        
        	case 2:
        		List<Student> students = studentdao.listStudents();
        	    for(Student student: students) {
        	    	
        	    	System.out.println(student);
        	    
        	    }
        	    break;
        	case 3:
        		System.out.println("Enter RollNumber");
        		rollNumber = sc.nextInt();
        		Student student2 = studentdao.getStudentById(rollNumber);
        		System.out.println(student2);
        		break;
        		
        	case 4:
        		System.out.println("Enter RollNumber");
        		rollNumber = sc.nextInt();
        		System.out.println("Enter Student AvgMarks:");
        		avgMarks = sc.nextFloat();
        
        		studentdao.updateStudent(rollNumber, avgMarks);
        		break;
        	case 5:
        		System.out.println("Enter RollNumber");
        		rollNumber = sc.nextInt();
        	    studentdao.deleteStudentById(rollNumber);
          		break;      
        	case  0:
        		System.exit(0);
        		break;
        	default:
        		System.out.println("You have entered wrong choice kindly enter between 0 - 5");
        		break;
        	
        }
        }while(choice != 0);
        
    }
}
