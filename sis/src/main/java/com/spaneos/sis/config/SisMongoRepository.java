package com.spaneos.sis.config;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spaneos.sis.domain.Student;

public interface SisMongoRepository  extends MongoRepository<Student,String> {
}
