package com.training.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.bean.Employee;

/**
 * skchandel2009@gmail.com
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringBean.xml");
        Employee employee=(Employee)context.getBean("developer");
        System.out.print(employee);
        
        employee=(Employee)context.getBean("teamLead");
        System.out.print(employee);
        
        employee=(Employee)context.getBean("manager");
        System.out.print(employee);
        
    }
}
