package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.bean.Triangle;

/**
 * skchandel2009@gmail.com
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringBean.xml");
        Triangle triangle=(Triangle)context.getBean("triangle2");
        triangle.drawTriangle();
        
    }
}