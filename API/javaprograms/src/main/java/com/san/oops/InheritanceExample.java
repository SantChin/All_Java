package com.san.oops;

abstract class Animal {
	String name;
}

class Dog extends Animal {
}

class Cat extends Animal {
}

public class InheritanceExample {

	public static void main(String args[]) {
		//Animal animal = new Animal();
		
		Dog dog = new Dog();
		dog.name = "Sam";
	}
}
