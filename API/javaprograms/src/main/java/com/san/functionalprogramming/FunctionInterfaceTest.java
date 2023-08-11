package com.san.functionalprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionInterfaceTest {

	public static void main(String[] args) {
		List<Person> personsList = Arrays.asList(
				new Person("Rohit", 20),
				new Person("Virat", 20),
				new Person("Dhoni", 20)
				
				);
		
		// Function to get the name of a person
        Function<Person, String> getName = person -> person.getName();
        
        // Function to convert a person's name to uppercase
		Function<Person,String> namesToUpper = getName.andThen(String::toUpperCase);
		
		List<String> namesListInUpperCase = new ArrayList<String>();
		
		for(Person person : personsList) {
			namesListInUpperCase.add(namesToUpper.apply(person));
		}
		
		System.out.println(namesListInUpperCase);
		
		
	}
}

















class Person {
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}