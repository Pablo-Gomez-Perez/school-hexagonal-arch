package com.hexagonal.app.infrastructure.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexagonal.app.infrastructure.entities.TeacherEntity;

public interface JpaTeacherRepository extends JpaRepository<TeacherEntity, Integer>{
	
	
	
}
