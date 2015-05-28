package com.spaneos.sis.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.spaneos.sis.config.SisMongoRepository;
import com.spaneos.sis.domain.Student;

@Repository
@Primary
public class MongoDbDaoImp implements SisDao {
	
	@Autowired
	private SisMongoRepository repository;
	
	@Override
	public boolean save(Student student) {
		repository.save(student);
		return true;
	}

	@Override
	public List<Student> findAll() {
		return repository.findAll();
	}

	@Override
	public Student get(int studentId) {
		return null;
	}

	@Override
	public boolean delete(int studentId) {
		return false;
	}

	public SisMongoRepository getRepository() {
		return repository;
	}

	public void setRepository(SisMongoRepository repository) {
		this.repository = repository;
	}

}
