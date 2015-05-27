package com.spaneos.sis.dao;

import java.util.List;

import com.spaneos.sis.domain.Student;

public interface SisDao {
		boolean save(Student student);
		List<Student> findAll();
		Student get(int studentId);
		boolean delete(int studentId);
		
}
