package com.darshan.SpringPractice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.darshan.SpringPractice.Alien;
import com.darshan.SpringPractice.Computer;
import com.darshan.SpringPractice.Desktop;
import com.darshan.SpringPractice.Laptop;

@Configuration  // for using Java Based Configuration we have to use this annotation
public class AppConfig {

//	@Bean // Stating that this is Bean
//	@Scope(value = "prototype") // setting Scope
//	public Desktop dekstop() {
//		return new Desktop();
//	}
	
	@Bean(name="desktop") // Stating that this is Bean
	@Scope(value = "singleton") // setting Scope
	@Primary
	public Desktop desktop() {
		return new Desktop();
	}
	
	@Bean(name = "latpot") //  name attribute is used for giving name for referingg it while usinig in main code bby default the name will be same as method name
	public Laptop lap() {
		return new Laptop();
	}
	
	@Bean
	public Alien al(@Qualifier("latpot")  @Autowired Computer com) { 
		// here we are passing the Computer Object in constructor
		// So that container will know that Alien will require Computer to run as it is dependent 
		// here we used concept of wiring which is Auto wiring so will use @Autowired 
		
		// @Qualifier annotation is used to tell which object to be used we can use bean name also  
		
		// But we can also use @Primary annotation
		
		Alien alien = new Alien(); // Creating the Object
		alien.setAge(24);
	
		//alien.setCom(lap());
		//alien.setCom(desktop());// but this is tightly coupling what if we want to pass laptop object
	
		alien.setCom(com);
		
		return alien;
	}
	
	
	
}
