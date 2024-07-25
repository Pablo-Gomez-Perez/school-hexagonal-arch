package com.hexagonal.app.application.services;

import java.util.List;
import java.util.Optional;

import com.hexagonal.app.domain.model.Teacher;
import com.hexagonal.app.domain.ports.inputs.ModelUseCasesManager;

public class TeacherService implements ModelUseCasesManager<Teacher> {
	
	private final ModelUseCasesManager<Teacher> teacherUseCasesManager;
		
	public TeacherService(ModelUseCasesManager<Teacher> teacherUseCasesManager) {
		super();
		this.teacherUseCasesManager = teacherUseCasesManager;
	}

	@Override
	public Optional<Teacher> getById(int id) {
		// TODO Auto-generated method stub
		return teacherUseCasesManager.getById(id);
	}

	@Override
	public List<Teacher> listAll(String name) {
		// TODO Auto-generated method stub
		return teacherUseCasesManager.listAll(name);
	}

	@Override
	public boolean create(Teacher item) {
		// TODO Auto-generated method stub
		return this.teacherUseCasesManager.create(item);
	}

	@Override
	public Optional<Teacher> update(Teacher item) {
		// TODO Auto-generated method stub
		return teacherUseCasesManager.update(item);
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return this.teacherUseCasesManager.delete(id);
	}

	
	
}
