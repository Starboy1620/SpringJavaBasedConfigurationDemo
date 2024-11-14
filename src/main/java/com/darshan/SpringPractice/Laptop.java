package com.darshan.SpringPractice;

public class Laptop implements Computer {

	@Override
	public void compile() {
		System.out.println("Compiling using Laptop");
	}

}
