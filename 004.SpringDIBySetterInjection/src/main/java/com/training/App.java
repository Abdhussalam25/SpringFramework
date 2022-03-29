package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.bean.Calculator;

/**
 * salambashaallabahas@gmail.com
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context =  new ClassPathXmlApplicationContext("SpringBean.xml");
       
       Calculator calci1 = (Calculator) context.getBean("calculator1");
       
       Calculator calci2 = (Calculator) context.getBean("calculator2");
      
       System.out.println(calci1.addNumbers());
       
       System.out.println(calci2.addNumbers());
       
    }
}
