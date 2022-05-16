package com.san.jpa.entity.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.san.jpa.entity.Course;
import com.san.jpa.entity.CourseMaterial;

@SpringBootTest
class CourseMaterialRepositoryTest {

	@Autowired
	CourseMaterialRepository courseMaterialRepository;
	
	@Test
	public void saveCourseMaterial() {
		
		Course course = Course.builder()
				.courseTitle("DSA")
				.credit(6)
				.build();
		
		CourseMaterial courseMaterial = CourseMaterial.builder().
				url("www.google.com")
				.course(course)
				.build();
		
		courseMaterialRepository.save(courseMaterial);
		
		
	}
	@Test
	public void printAllCourseMaterials() {
		
		List<CourseMaterial> courseMaterialsList = courseMaterialRepository.findAll();
		System.out.println(courseMaterialsList);
		
	}

}
