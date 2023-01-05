package com.san.streams.practice1;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTest1 {

	public static void main(String[] args) {

		Student student1 = new Student("Jayesh", 20, new Address("1234"),
				Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));

		Student student2 = new Student("Khyati", 20, new Address("1235"),
				Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));

		Student student3 = new Student("Jason", 20, new Address("1236"),
				Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));

		List<Student> students = Arrays.asList(student1, student2, student3);

		// 1.Get student with exact match name "jayesh"
		
		Optional<Student> stdWithNameJayesh = students.stream().filter(s -> s.getName().equalsIgnoreCase("Jayesh"))
				.findFirst();
		if (stdWithNameJayesh.isPresent()) {
			System.out.println("stdWithNameJayesh : " + stdWithNameJayesh.get().toString());
		}

		// 2. Get student with matching address "1235"
		Optional<Student> stdWithAddr12345 = students.stream().filter(s -> s.getAddress().getZipcode().equals("1235"))
				.findFirst();
		if (stdWithAddr12345.isPresent()) {
			System.out.println("stdWithAddr12345 : " + stdWithAddr12345.get().toString());
		}

		// 3.Get all student having mobile numbers 3333.
		List<Student> stdHavingMobileNumber3333 = students.stream().filter(s->s.getMobileNumbers().stream()
				.anyMatch(x->Objects.equals(x.getNumber(), "3333")))
				.collect(Collectors.toList());
		if(stdHavingMobileNumber3333.size() > 0) {
			System.out.println("stdHavingMobileNumber3333 : " +stdHavingMobileNumber3333);
		}
		
		
		// 4. Get all student having mobile number 1233 and 1234 and print there names as well
		//   4.1 List Of Students
		
		List<Student> studentHavingMobileNumber1233And1234 = students.stream().filter(s->s.getMobileNumbers().stream()
				.allMatch(x->Objects.equals(x.getNumber(), "1233") || Objects.equals(x.getNumber(), "1234")))
				.collect(Collectors.toList());
		if(studentHavingMobileNumber1233And1234.size() > 0) {
			System.out.println("studentHavingMobileNumber1233And1234 : " +studentHavingMobileNumber1233And1234);
		}
		
		//   4.2 List Of Students Only Names
		String studentHavingMobileNumber1233And1234OnlyNames = students.stream().filter(s->s.getMobileNumbers().stream()
				.allMatch(x->Objects.equals(x.getNumber(), "1233") || Objects.equals(x.getNumber(), "1234")))
				.collect(Collectors.toList())
				.stream().map(s->s.getName()).collect(Collectors.joining(",", "[", "]"));
		System.out.println(studentHavingMobileNumber1233And1234OnlyNames);
		
		//5. Create a List<Student> from the List<TempStudent>
		TempStudent tmpStud1 = new TempStudent(
	            "Jayesh1",
	            201,
	            new Address("12341"),
	            Arrays.asList(new MobileNumber("12331"), new MobileNumber("12341")));
	 
	        TempStudent tmpStud2 = new TempStudent(
	            "Khyati1",
	            202,
	            new Address("12351"),
	            Arrays.asList(new MobileNumber("11111"), new MobileNumber("33331"), new MobileNumber("12331")));
	 
	        List<TempStudent> tmpStudents = Arrays.asList(tmpStud1, tmpStud2);
	        List<Student> studentList = tmpStudents.stream()
	                .map(tmpStud -> new Student(tmpStud.name, tmpStud.age, tmpStud.address, tmpStud.mobileNumbers))
	                .collect(Collectors.toList());
	     
	            System.out.println(studentList);
	            System.out.println("--------------------");
		
//		Convert List<Student> to List<String> of student name
//		Convert List<students> to String
//		Change the case of List<String>
//		Sort List<String>
//		Conditionally apply Filter condition, say if flag is enabled then.
	}
}
