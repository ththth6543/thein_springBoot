package com.jun.student.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jun.student.service.StudentService;
import com.jun.student.dto.Student;

@RestController
public class StudentController {

	private final StudentService service;

	public StudentController(StudentService service) {
		this.service = service;
	}

	@GetMapping("/students")
	public List<Student> students() {
		return service.findAll();
	}

}
