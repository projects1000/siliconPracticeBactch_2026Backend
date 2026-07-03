package com.silicon.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.silicon.demo.model.StudentDetails;

@Repository
public interface StudentRepository extends JpaRepository<StudentDetails, Integer>{

}
