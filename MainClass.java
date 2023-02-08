package com.java.core.inheritance;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Elephant e = new Elephant();
		e.name = "Elephant";
		e.color = "Black";
		e.legs = 4;
		
		e.display();
		e.bigAnimal();
		e.foodHabbit();
		
		Cub c = new Cub();
		c.name = "Cub";
		c.color = "Brown";
		c.legs = 4;
		
		c.display();
		c.kid();
		c.kingOfForest();
		c.foodHabbit();
		c.testMethod();
		
		

	}

}
