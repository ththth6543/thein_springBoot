package com.jun.student.service;

import java.util.List;
import com.jun.student.dto.Student;
import com.jun.student.repository.StudentRepository;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	private final StudentRepository repository;
	
	public StudentService(StudentRepository repository) {
		this.repository = repository;
	}
	
	public List<Student> findAll() {
		return repository.findAll();
	}
}
