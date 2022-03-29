package com.training;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.bean.Triangle;


public class App 
{
    public static void main( String[] args )
    {
      
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
    	Triangle triangle = (Triangle) context.getBean("triangle");
    	triangle.drawTriangle();
    	context.registerShutdownHook();
    }
}
