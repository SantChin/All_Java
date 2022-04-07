package com.san.jpa.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {

	@Id
	@SequenceGenerator(name = "course_seq", sequenceName = "course_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_seq")
	private Long courseId;
	private String courseTitle;
	private int credit;

	@OneToOne(mappedBy = "course")
	private CourseMaterial courseMaterial;
	
	
	@ManyToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY,optional=false)
	@JoinColumn(name="teacher_id",referencedColumnName="teacherId" )
	private Teacher teacher;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="student_course_map",joinColumns=@JoinColumn(name="course_id",referencedColumnName="courseId"),
	inverseJoinColumns=@JoinColumn(name="student_id",referencedColumnName="studentId"))
	private List<Student> students;
}
