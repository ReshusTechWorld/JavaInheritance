package com.java.core.inheritance;

public class Animal {
	
	String name;
	int legs;
	String color;
	
	void display() {
		System.out.println();
		System.out.println(name);
		System.out.println("********");
		System.out.println(name + " has " + legs +" legs");
		System.out.println(name + "'s color is " + color);
	}
	
	void testMethod() {
		System.out.println("Method for testing multi level inheritance!");
	}
}
	

