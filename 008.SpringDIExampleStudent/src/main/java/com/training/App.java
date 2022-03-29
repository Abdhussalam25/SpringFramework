package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.bean.Student;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
ApplicationContext context =  new ClassPathXmlApplicationContext("SpringBean.xml");
    	
    	Student student1 = (Student) context.getBean("student");
    	Student student2 = (Student) context.getBean("student1");
    	
    	student1.display();
    	
    	student2.display();
    	
    }
}
