package com.darshan.SpringPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.darshan.SpringPractice.config.AppConfig;

public class App 
{
    public static void main( String[] args )
    {
      // ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
       
//       Alien al = context.getBean("alien", Alien.class);
//       al.code();
     
    	
    	  // Using Java Based Annotation	
    	
       ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
            
		Desktop dt = context.getBean(Desktop.class);  // we are specifying a type 
		dt.compile();
		
		//Desktop dt1 = context.getBean(Desktop.class); // for prototype use
		//dt1.compile();
		
		Laptop lt = (Laptop) context.getBean("latpot");  // will specify the name 
		lt.compile();
		
		Alien al = context.getBean(Alien.class);
		
		al.getAge();
		al.code();
    }
}
