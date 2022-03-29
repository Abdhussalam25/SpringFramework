package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.bean.Triangle;

/**
 * salambasshaallabahas@gmail.com
 *
 */
public class App 
{
    public static void main( String[] args )
    {
ApplicationContext context =  new ClassPathXmlApplicationContext("SpringBean.xml");
    	
    	Triangle tri = (Triangle) context.getBean("triangle");
//    	
    	tri.drawTriangle();
    }
}
