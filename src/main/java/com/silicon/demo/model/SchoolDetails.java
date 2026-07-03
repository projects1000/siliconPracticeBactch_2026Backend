package com.silicon.demo.model;

import io.swagger.v3.oas.annotations.media.Schema;

public class SchoolDetails {

    @Schema(description = "Name of the school", example = "Silicon Public School")
    private String schoolName;

    @Schema(description = "Unique school identifier", example = "101")
    private int schoolId;

    @Schema(description = "Principal name of the school", example = "Rajesh Kumar")
    private String principalName;

    @Schema(description = "School address", example = "Patia Main Road")
    private String address;

    @Schema(description = "City where school is located", example = "Bhubaneswar")
    private String city;

    @Schema(description = "State where school is located", example = "Odisha")
    private String state;

    @Schema(description = "Postal code", example = "751024")
    private String pincode;

    @Schema(description = "School contact number", example = "9876543210")
    private String contactNumber;

    @Schema(description = "School email address", example = "info@siliconschool.com")
    private String email;

    @Schema(description = "Total number of students", example = "1200")
    private int totalStudents;

    @Schema(description = "Total number of teachers", example = "60")
    private int totalTeachers;

    @Schema(description = "Education board", example = "CBSE")
    private String boardType;

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public String getPrincipalName() {
		return principalName;
	}

	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTotalStudents() {
		return totalStudents;
	}

	public void setTotalStudents(int totalStudents) {
		this.totalStudents = totalStudents;
	}

	public int getTotalTeachers() {
		return totalTeachers;
	}

	public void setTotalTeachers(int totalTeachers) {
		this.totalTeachers = totalTeachers;
	}

	public String getBoardType() {
		return boardType;
	}

	public void setBoardType(String boardType) {
		this.boardType = boardType;
	}

    // Getters and Setters
}