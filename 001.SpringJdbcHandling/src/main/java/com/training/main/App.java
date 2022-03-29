package com.training.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.bean.Student;
import com.training.dao.StudentDao;
import com.training.dao.StudentDaoImpl;

/**
 * skchandel2009@gmail.com
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringBean.xml");
        StudentDao studentDao=(StudentDaoImpl)context.getBean("studentdao");
        //adding records
        studentDao.createStudent(111, "Lalitha", "Science", 89);
        studentDao.createStudent(222, "Vasudha", "Science", 69);
        studentDao.createStudent(333, "Salambasa", "Commerce", 79);
        studentDao.createStudent(444, "Sricharan", "Art", 88);
        studentDao.createStudent(555, "Ashwin", "Commerce", 77);
        
        //showing all records
        List <Student> students=studentDao.getStudents();
        for(Student student:students) {
        	System.out.print(student);
        }
        
        //showing student information whose rollNumber=222
        Student student=studentDao.getStudentById(222);
        System.out.print(student);
        
        //updating student avgmarks by 88 of rollNumber 555
        studentDao.updateStudent(555, 88);
        
      //showing all records
        students=studentDao.getStudents();
        for(Student st:students) {
        	System.out.print(st);
        }
        
        //deleting student by rollNumber=444
        studentDao.deleteStudentById(222);
       
        
      //showing all records
        students=studentDao.getStudents();
        for(Student st:students) {
        	System.out.print(st);
        }
        
    }
}
