package com.san.jpa.entity.repository;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.san.jpa.entity.Student;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootTest
//@DataJpaTest
class StudentRepositoryTest {
	
	@Autowired
	StudentRepository studentRepository; 
	
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	
	@Test
	public void saveStudent() {
		Student student = Student.builder()
				.emailId("santosh@gmil.com")
				.firstName("Santosh")
				.lastName("Ch")
				//.guardianEmail("Ram@gmail.com")
				//.guardianMobile("1111111111")
				//.guardianName("Ram")
				.build();
		studentRepository.save(student);
		
	}
	
	/*@Test
	public saveStudentWithGuardian() {
		Student student = Student.builder()
				.firstName("")
				.lastName("")
				.emailId("")
				.guardian(guardian)
	}*/
	
	@Test
	public void printAllStudents() {
		List<Student> list = studentRepository.findAll();
		System.out.println(list);
	}
	
	@Test
	public void getStudentbyemailaddr() {
		
	}

}
