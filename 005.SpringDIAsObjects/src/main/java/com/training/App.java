package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.bean.Triangle;

/**
 * salambashaallabahas@gmail.com
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =  new ClassPathXmlApplicationContext("SpringBean.xml");
    	
    	Triangle tri = (Triangle) context.getBean("triangle1");
//    	
//    	System.out.println(tri.getPointA());
//    	System.out.println(tri.getPointB());
//    	System.out.println(tri.getPointC());
    	tri.drawTriangle();
    	
    	
    	
    }
}
