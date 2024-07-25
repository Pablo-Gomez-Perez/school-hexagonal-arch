package com.hexagonal.app.application.usecases;

import java.util.List;
import java.util.Optional;

import com.hexagonal.app.domain.model.Teacher;
import com.hexagonal.app.domain.ports.inputs.ModelUseCasesManager;
import com.hexagonal.app.domain.ports.outputs.ModelDataManagerRepository;

public class TeacherUseCasesManagerImpl implements ModelUseCasesManager<Teacher> {

	private final ModelDataManagerRepository<Teacher> teacherDataManagerRepository;

	public TeacherUseCasesManagerImpl(ModelDataManagerRepository<Teacher> teacherDataManagerRepository) {
		this.teacherDataManagerRepository = teacherDataManagerRepository;
	}

	@Override
	public Optional<Teacher> getById(int id) {
		// TODO Auto-generated method stub
		return this.teacherDataManagerRepository.getById(id);
	}

	@Override
	public List<Teacher> listAll(String name) {
		// TODO Auto-generated method stub
		return this.teacherDataManagerRepository.listAll(name);
	}

	@Override
	public Teacher create(Teacher item) {
		// TODO Auto-generated method stub
		return this.teacherDataManagerRepository.create(item);
	}

	@Override
	public Optional<Teacher> update(Teacher item) {
		// TODO Auto-generated method stub
		return this.teacherDataManagerRepository.update(item);
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return this.teacherDataManagerRepository.delete(id);
	}

}
