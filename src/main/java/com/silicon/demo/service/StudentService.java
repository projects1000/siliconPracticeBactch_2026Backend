package com.silicon.demo.service;

import java.util.List;

import com.silicon.demo.model.StudentDetails;

public interface StudentService {

    // This will fetch all student data
	List<StudentDetails> getStudentDetails();
	
	// Get a studentobject by id 
	StudentDetails  getStudentById(int id);
	
	StudentDetails save(StudentDetails studentDetails);
	
	StudentDetails update(StudentDetails studentDetails);
	
	void delete(int id);
	
	
}
