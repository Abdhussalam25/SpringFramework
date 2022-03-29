package com.training.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.bean.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
    	
    	Employee devloper = (Employee) context.getBean("developer");
    	
    	System.out.println(devloper);
    	
    }
}
