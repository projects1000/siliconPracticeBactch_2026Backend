package com.silicon.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.silicon.demo.model.Address;
import com.silicon.demo.model.Course;
import com.silicon.demo.model.ParentResponse;
import com.silicon.demo.model.SchoolDetails;
import com.silicon.demo.model.SectionDeatils;
import com.silicon.demo.model.StudentDetails;
import com.silicon.demo.model.TransportDetails;
import com.silicon.demo.service.StudentService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/home")
@Tag(name = "Welcome API", description = "Operations related to WZelcome Management")
public class WelcomeController {

	@Autowired
	StudentService studentService;
	/**
	 * This is welcome method This is GET method
	 * 
	 * @return String
	 */
	@GetMapping("/welcome")
	public String welcome() {
		System.out.println("Welcomne called");

		return "Welcome to SIlicon";
	}

	/**
	 * This method is used for getting courses
	 * 
	 * @return List of courses
	 */
	@GetMapping("/courses/{id}")
	public List<Course> getCourse(@PathVariable int id) {

		List<Course> courses = new ArrayList<>();

		List<Course> returnCourses = new ArrayList<>();

		Course courseOne = new Course();// 1st object initialization
		courseOne.setCourseId(101);
		courseOne.setCourseName("Math");

		Course courseTwo = new Course();// 2nd object initialization
		courseTwo.setCourseId(102);
		courseTwo.setCourseName("Science");

		courses.add(courseOne);
		courses.add(courseTwo);

		for (Course course : courses) {

			if (course.getCourseId() == id) {
				returnCourses.add(course);
			}
		}

		return returnCourses;

	}

	@PostMapping("/store")
	@Operation(summary = "Save Address", description = "This API accepts Address details in JSON format and stores the address information.")
	public String save(@RequestBody Address add) {

		String name = add.getName();
		String address = add.getAddress();

		System.out.println("Name :" + name);
		System.out.println("Address :" + address);

		return "Address saved " + name + " : " + address;

	}

	@GetMapping("/getAllSchoolData")
	@Operation(summary = "Get School info ", description = "This API throw school info")
	public ParentResponse getAllSchoolData() {
		ParentResponse parent = new ParentResponse();

		// details of school object need to create and set
		SchoolDetails schoolDetails = new SchoolDetails();

		schoolDetails.setSchoolId(101);
		schoolDetails.setSchoolName("Silicon Public School");
		schoolDetails.setPrincipalName("Rajesh Kumar");
		schoolDetails.setEmail("info@siliconschool.com");
		schoolDetails.setTotalStudents(1200);
		schoolDetails.setTotalTeachers(60);
		schoolDetails.setBoardType("CBSE");

		List<SectionDeatils> listSectionDetails = new ArrayList<>();

		// details of section object need to create and set
		SectionDeatils sectionDeatil1 = new SectionDeatils();
		sectionDeatil1.setRegnNum(33334);
		sectionDeatil1.setStudentName("RajKishore");

		SectionDeatils sectionDeatil2 = new SectionDeatils();
		sectionDeatil2.setRegnNum(77777);
		sectionDeatil2.setStudentName("Tatwabit");

		listSectionDetails.add(sectionDeatil1);
		listSectionDetails.add(sectionDeatil2);

		// details of transport object need to create and set

		List<TransportDetails> listTransportDetails = new ArrayList<>();

		TransportDetails transportDetails1 = new TransportDetails();
		transportDetails1.setDriverName("Kabir");
		transportDetails1.setVehicleNumber("MH04GH5988");

		TransportDetails transportDetails2 = new TransportDetails();
		transportDetails2.setDriverName("Kabir");
		transportDetails2.setVehicleNumber("MH04GH5988");

		listTransportDetails.add(transportDetails1);
		listTransportDetails.add(transportDetails2);

		// set the three object into parent object

		parent.setDetails(schoolDetails);
		parent.setSectionDeatils(listSectionDetails);
		parent.setTransportDetails(listTransportDetails);

		return parent;

	}
	
	
	
	/**
	 * This method helps to retreive all student data
	 * @return
	 */
	@Operation(summary = "Get all student details  ", description = "This API retrieve all student info")
    @GetMapping("/getAllStudent")
	public  List<StudentDetails>  getAllStudentDeatails()
	{		
		// List<StudentDeatils> listOfStudents =    studentService.getStudentDetails();	
		
		return  studentService.getStudentDetails();
		
	}
	
	@GetMapping("/getStudnetById/{id}")
	public  StudentDetails getStudentsById(@PathVariable int id )
	{
		StudentDetails studentDetails =   studentService.getStudentById(id);
		
		return studentDetails;	
	}
	
	@PostMapping("/save")
	public StudentDetails save(@RequestBody StudentDetails studentDetails)
	{
		
		//Address add = new Address("raju","Cuttack");
		
		return studentService.save(studentDetails);
		

	}

	@PutMapping("/update")
	public StudentDetails update(@RequestBody StudentDetails studentDetails)
	{
		
		//Address add = new Address("raju","Cuttack");
		
		return studentService.update(studentDetails);
		

	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable  int id)
	{
			
		 studentService.delete(id);
		

	}
	
}
