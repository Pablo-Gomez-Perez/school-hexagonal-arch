package com.hexagonal.app.infrastructure.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexagonal.app.infrastructure.entities.StudentEntity;

public interface JpaStudentRepository extends JpaRepository<StudentEntity, Integer>{

}
