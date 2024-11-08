package com.sazzad.mysql.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sazzad.mysql.entity.Student;
import com.sazzad.mysql.repo.StudentRepository;
import com.sazzad.mysql.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	 @Autowired
	 private StudentRepository studentRepository;

	 	@Override
	 	public List<Student> getAllStudents() {
	        return studentRepository.findAll();
	    }
	 	
	 	@Override
		@Cacheable(value = "userCache", key = "#id")
	    public Optional<Student> getStudentById(Long id) {
	        return studentRepository.findById(id);
	    }
	 	
	 	@Override
	    public Student createOrUpdateStudent(Student student) {
	        return studentRepository.save(student);
	    }
	 	
	 	@Override
	    public void deleteStudentById(Long id) {
	        studentRepository.deleteById(id);
	    }

}
