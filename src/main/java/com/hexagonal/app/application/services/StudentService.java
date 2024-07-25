package com.hexagonal.app.application.services;

import java.util.List;
import java.util.Optional;

import com.hexagonal.app.domain.model.Student;
import com.hexagonal.app.domain.ports.inputs.ModelUseCasesManager;

public class StudentService implements ModelUseCasesManager<Student> {

	
	private final ModelUseCasesManager<Student> studentUseCasesManager;		
	
	public StudentService(ModelUseCasesManager<Student> studentUseCasesManager) {
		super();
		this.studentUseCasesManager = studentUseCasesManager;
	}

	@Override
	public Optional<Student> getById(int id) {
		
		return this.studentUseCasesManager.getById(id);
	}

	@Override
	public List<Student> listAll(String name) {
		// TODO Auto-generated method stub
		return this.studentUseCasesManager.listAll(name);
	}

	@Override
	public boolean create(Student item) {
		// TODO Auto-generated method stub
		return this.studentUseCasesManager.create(item);
	}

	@Override
	public Optional<Student> update(Student item) {
		// TODO Auto-generated method stub
		return this.studentUseCasesManager.update(item);
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return this.studentUseCasesManager.delete(id);
	}
	
	
	
}
