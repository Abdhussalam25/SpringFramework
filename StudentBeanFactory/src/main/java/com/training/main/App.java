package com.training.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.bean.Student;


public class App 
{
    public static void main( String[] args )
    {

ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
    	
    	Student student1 = (Student) context.getBean("arts");
    	Student student2 = (Student) context.getBean("science");
    	Student student3 = (Student) context.getBean("comerce");
    	
    	
    	System.out.println(student1);
    	System.out.println(student2);
    	System.out.println(student3);
    	

    	
    }
}
