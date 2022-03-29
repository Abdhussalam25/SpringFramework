package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * skchandel2009@gmail.com
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("SpringBean.xml");
        System.out.print(context.getBean("helloIndia"));
        System.out.print(context.getBean("helloWorld"));
        System.out.print(context.getBean("helloIndia"));
       
    }
}
