package com.spaneos.sis.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spaneos.sis.domain.Student;

@Repository
@Primary
public class SisHibernateDaoImp implements SisDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public boolean save(Student student) {
		Session session = getSessionFactory().getCurrentSession();
		if (session.save(student) != null)
			return true;
		return false;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Student> findAll() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Student");
		return query.list();
	}

	@Override
	public Student get(int studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int studentId) {
		// TODO Auto-generated method stub
		return false;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
