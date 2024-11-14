package com.darshan.SpringPractice;

import org.springframework.stereotype.Component;

@Component  // This is Sterotype annotation which swill let know that this is class and Spring has to manage the Objects for it. And use everywhere where we want to use objects
public class Alien {

	private int age;
	private Computer com;
	
	public Alien() {
		//System.out.println("Object Created");
	}
	
//	@ConstructorProperties({"age","lap"})
//	public Alien(int age,Computer lap) {
//		System.out.println("Para Constructor Called");
//		this.age = age;
//		this.lap = lap;
//	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {    // Setter Injection
		//System.out.println("Setter called");
		this.age = age;
	}
	
	public Computer getCom() {
		return com;
	}
	
	public void setCom(Computer com) {
		this.com = com;
	}
	
	public void code() {
		System.out.println(" Alien is Coding ");
		com.compile();
	}
	
	
}
