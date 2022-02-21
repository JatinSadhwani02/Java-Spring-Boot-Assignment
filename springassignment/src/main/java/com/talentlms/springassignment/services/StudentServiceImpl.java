package com.talentlms.springassignment.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talentlms.springassignment.entities.StudentInfo;
import com.talentlms.springassignment.student.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private Student student;
	
	@Override
	public List<StudentInfo> getInformation() {
		return student.findAll();
	}

	@Override
	public StudentInfo addStudent(StudentInfo studentInfo) {
		student.save(studentInfo);
		return studentInfo;
	}
	
}
