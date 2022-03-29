package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.bean.Hello;

class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
        
        Hello hello = (Hello) context.getBean("hello"); //id name
        
        hello.sayHello();
    	
    }
}
