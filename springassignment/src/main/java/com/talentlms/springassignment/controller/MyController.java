package com.talentlms.springassignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.talentlms.springassignment.entities.StudentInfo;
import com.talentlms.springassignment.services.StudentService;


@RestController
public class MyController {

	@Autowired
	private StudentService studentService;
	
	// Get api to fetch all the data from mysql database
	@GetMapping("detail")
	public List<StudentInfo> getCourses() {
		return this.studentService.getInformation();
	}
	
	// post api to add data in mysql database
	@PostMapping(path="addstudent",consumes= "application/json")
	public StudentInfo addStudent(@RequestBody  StudentInfo studentInfo) {
		return this.studentService.addStudent(studentInfo);
	}
	
}

