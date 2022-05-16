package com.san.jpa.entity.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.san.jpa.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	public List<Student> findByFirstName(String name);
	
	public List<Student> findByFirstNameContaining(String name);
	
	public List<Student> findByLastNameNotNull();
	
	public List<Student> findByGuardianName(String name);
	
	public Student findByFirstNameAndLastName(String fname,String lname);
	
	//JPQL
	@Query("select s from Student s where s.emailId = ?1")
	public Student getStudentByEmailAddress(String email);
	
	//JPQL
	@Query("select s.firstName from Student s where s.emailId = ?1")
	public Student getStudentByFirstNameEmailAddress(String email);
	
	
	//Native Query
	@Query(
			value = "select * from tab_student s where s.email_addr=?1",
			nativeQuery = true)
	public Student getStudentByEmailAddressNative(String email);
	
	
	//Native Query Named Param
	@Query(
			value = "select * from tab_student s where s.email_addr=:emailId",
			nativeQuery = true)
	public Student getStudentByEmailAddressNativeNamedParameter(@Param("emailId") String email);
	
	
	@Modifying
	@Transactional
	@Query(
			value="update tbl_student set firstName=?1 where email_addr=?2",
			nativeQuery=true
			)
	public int updateStudentNameByEmailId(String firstName,String emailId);
}
