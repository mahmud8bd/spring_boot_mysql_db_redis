package com.sazzad.mysql.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sazzad.mysql.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
