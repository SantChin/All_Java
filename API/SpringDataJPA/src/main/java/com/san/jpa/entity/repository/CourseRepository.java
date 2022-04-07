package com.san.jpa.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.san.jpa.entity.Course;
@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
