package com.silicon.demo.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;


public class SectionDeatils {

    @Schema(description = "Student Name", example = "Rahul Kumar")
    private String studentName;

    @Schema(description = "Student Registration Number", example = "1001")
    private int regnNum;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRegnNum() {
        return regnNum;
    }

    public void setRegnNum(int regnNum) {
        this.regnNum = regnNum;
    }
}