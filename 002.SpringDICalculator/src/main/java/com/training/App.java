package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.bean.Calculator;


public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
    
       Calculator calc = (Calculator) context.getBean("calculator");
       
       System.out.println(calc.add(5, 10));
       System.out.println(calc.sub(20, 15));
      
       
    }
}
