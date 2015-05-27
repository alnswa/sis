package com.spaneos.sis.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spaneos.sis.dao.SisDao;
import com.spaneos.sis.domain.Student;

@Service
public class SisServiceImp implements SisService {
	@Autowired
	private SisDao sisDao;

	@Override
	public boolean addStudent(Student student) {
		if (student != null)
			return sisDao.save(student);
		else
			throw new IllegalArgumentException();
	}

	@Override
	public List<Student> getStudents() {
		List<Student> studentList = sisDao.findAll();
		if (studentList != null)
			return studentList;
		else
			throw new IllegalArgumentException();
	}

}
