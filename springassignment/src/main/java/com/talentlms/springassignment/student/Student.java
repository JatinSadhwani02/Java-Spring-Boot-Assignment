package com.talentlms.springassignment.student;

import org.springframework.data.jpa.repository.JpaRepository;

import com.talentlms.springassignment.entities.StudentInfo;

public interface Student extends JpaRepository<StudentInfo, Long> {

}
