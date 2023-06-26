package com.sab.aaa.drunk.prgms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class USTGlobal {
	public static void main(String[] args) {
//		--coding questions
//		1.Find words starting with A and collect them?
		
		List<String> words = Arrays.asList("Ajay","Vijay","Ankit","Rahul","Vinod");
		
		List<String> wordsStartWithA = words.stream().filter(s->s.startsWith("A")).collect(Collectors.toList());
		System.out.println(wordsStartWithA);
		
//		2.Filter employees and group them based on gender?
		
		List<Employee>  empList = Arrays.asList(
				new Employee(1,"Ajay","Male"),
				new Employee(2, "Radha", "Female"),
				new Employee(3, "Sunnay", "Male"),
				new Employee(4, "Kamala", "Female")
				);
				
		Map<String, List<Employee>> mapWithGenders = empList.stream().collect(Collectors.groupingBy(Employee::getGender));
		mapWithGenders.forEach((k,v)-> {System.out.println(k+v);});
		
//		3.Find duplicates words in a String with their count?
		String input = "Head First Dummy Head First";
		Map<String,Integer> result = new HashMap<>();
		String[] arr = input.split(" ");
		for(String s  : arr) {
			
			if(result.containsKey(s)) {
				result.put(s, result.get(s)+1);
			}else {
				result.put(s, 1);
			}
		}
		result.forEach((k,v)-> {System.out.println(k +"--->"+v);});
		
		
//		4.Create a custom functional interface and use it in main method with lambda expression?
//		
		USTFunctionalInterfae funInter = () -> {
			System.out.println(" From the functional Interafce");
		};
		
		funInter.display();
		
		
		
		
	}
	
	private static class Employee {
		
		private int Id;
		private String name;
		private String gender;
		
		public Employee(int id, String name, String gender) {
			super();
			Id = id;
			this.name = name;
			this.gender = gender;
		}
		
		public int getId() {
			return Id;
		}
		public void setId(int id) {
			Id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Employee [name=" + name + ", gender=" + gender + "]";
		}
		
		
		
	}
	
}
