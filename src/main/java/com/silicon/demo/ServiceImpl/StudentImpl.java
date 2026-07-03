package com.silicon.demo.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.silicon.demo.model.StudentDetails;
import com.silicon.demo.repo.StudentRepository;
import com.silicon.demo.service.StudentService;

@Service
public class StudentImpl implements StudentService{

	@Autowired
	StudentRepository studentRepository;
	
	
	/**
	 * This method helps to retrive all data from db
	 */
	@Override
	public List<StudentDetails> getStudentDetails() {
		
		 List<StudentDetails> listOfStudents =   studentRepository.findAll();

		return listOfStudents;
	}


	/**
	 * This method helps to retrive perticulat data from db by id
	 */
	@Override
	public StudentDetails getStudentById(int id) {
		
//		Optional<StudentDetails> studentDetails =   studentRepository.findById(id) ;
//		   
//		   if(studentDetails.isPresent())
//		   {
//			  return  studentDetails.get();
//		   }
//		   	   
//		return null;
		
		return studentRepository.findById(id).orElse(null);
		   		
	}


	/**
	 * save method
	 */
	@Override
	public StudentDetails save(StudentDetails studentDetails) {
		
		StudentDetails studentDetail = studentRepository.save(studentDetails);
		// TODO Auto-generated method stub
		return studentDetail;
	}


	@Override
	public StudentDetails update(StudentDetails studentDetails) {

	    Optional<StudentDetails> optionalStudent =
	            studentRepository.findById(studentDetails.getId());

	    if (optionalStudent.isPresent()) {

	        StudentDetails existingStudent = optionalStudent.get();

	        existingStudent.setName(studentDetails.getName());
	        existingStudent.setAddress(studentDetails.getAddress());   

	        return studentRepository.save(existingStudent);
	    }

	    return null;
	}


	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
		studentRepository.deleteById(id);
		
	}

}
