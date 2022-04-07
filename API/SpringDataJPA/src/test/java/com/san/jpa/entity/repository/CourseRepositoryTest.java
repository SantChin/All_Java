package com.san.jpa.entity.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.san.jpa.entity.Course;

@SpringBootTest
class CourseRepositoryTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Autowired
	private CourseRepository courseRepository;
	
	@Test
	public void pritnCourse() {
		List<Course> courseList = courseRepository.findAll();
		System.out.println(courseList);
	}
}
