package com.talentlms.springassignment.services;

import java.util.List;

import com.talentlms.springassignment.entities.StudentInfo;

public interface StudentService {
	public List<StudentInfo> getInformation();
	public StudentInfo addStudent(StudentInfo studentInfo);
}
