package com.hexagonal.app.application.usecases;

import java.util.List;
import java.util.Optional;

import com.hexagonal.app.domain.model.Student;
import com.hexagonal.app.domain.ports.inputs.ModelUseCasesManager;
import com.hexagonal.app.domain.ports.outputs.ModelDataManagerRepository;

public class StudentUseCasesManagerImpl implements ModelUseCasesManager<Student>{
	
	private final ModelDataManagerRepository<Student> studentDataManagerRepository;
		
	
	public StudentUseCasesManagerImpl(ModelDataManagerRepository<Student> studentDataManagerRepository) {
		super();
		this.studentDataManagerRepository = studentDataManagerRepository;
	}

	@Override
	public Optional<Student> getById(int id) {
		// TODO Auto-generated method stub
		return this.studentDataManagerRepository.getById(id);
	}

	@Override
	public List<Student> listAll(String name) {
		// TODO Auto-generated method stub
		return this.studentDataManagerRepository.listAll(name);
	}

	@Override
	public boolean create(Student item) {
		// TODO Auto-generated method stub
		return this.studentDataManagerRepository.create(item);
	}

	@Override
	public Optional<Student> update(Student item) {
		// TODO Auto-generated method stub
		return this.studentDataManagerRepository.update(item);
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return this.studentDataManagerRepository.delete(id);
	}

	
	
	
}
