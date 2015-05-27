package com.spaneos.sis.service;

import java.util.List;

import com.spaneos.sis.domain.Student;

public interface SisService {
		public boolean addStudent(Student student);
		public List<Student> getStudents();
}
