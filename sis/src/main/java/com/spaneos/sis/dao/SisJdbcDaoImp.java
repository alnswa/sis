package com.spaneos.sis.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spaneos.sis.domain.Student;

@Repository
public class SisJdbcDaoImp implements SisDao {
	@Autowired
	private JdbcTemplate jdbcTempalte;

	@Override
	public boolean save(Student student) {
		jdbcTempalte.update("insert into student values(?,?,?,?,?,?,?,?,?,?)",
				new Object[] {student.getStudentId()});
		return false;
	}

	@Override
	public List<Student> findAll() {

		return jdbcTempalte.query("select * from student",
				new RowMapper<Student>() {

					@Override
					public Student mapRow(ResultSet rs, int count)
							throws SQLException {
						int studentId = rs.getInt("studentid");
						String fullName = rs.getString("fullname");
						String email = rs.getString("email");
						String qualification = rs.getString("qualification");
						double percentage = rs.getDouble("percentage");
						String batch = rs.getString("batch");
						String college = rs.getString("college");
						String city = rs.getString("city");
						String state = rs.getString("state");
						String branch = rs.getString("branch");
						Student s = new Student(studentId, fullName, batch,
								email, qualification, college, percentage,
								branch, city, state);

						return s;
					}

				});
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

	public JdbcTemplate getJdbcTempalte() {
		return jdbcTempalte;
	}

	public void setJdbcTempalte(JdbcTemplate jdbcTempalte) {
		this.jdbcTempalte = jdbcTempalte;
	}

}
