package com.java.core.inheritance;

public class Lion extends Animal {
	

	void kingOfForest() {
		System.out.println("Lion is the king of Forest!");
	}
	void foodHabbit() {
		System.out.println("Lion is a carnivores!");
	}
	
}
class Cub extends Lion{
	void kid() {
		System.out.println("Cub is the kid of Lion!");
	}

}
