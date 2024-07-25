package com.hexagonal.app.infrastructure.adapters;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.hexagonal.app.domain.model.Teacher;
import com.hexagonal.app.domain.ports.outputs.ModelDataManagerRepository;
import com.hexagonal.app.infrastructure.entities.TeacherEntity;
import com.hexagonal.app.infrastructure.respositories.JpaTeacherRepository;

public class JpaTeacherRepositoryAdapter implements ModelDataManagerRepository<Teacher> {

	private final JpaTeacherRepository jpaTeacherRepository;

	public JpaTeacherRepositoryAdapter(JpaTeacherRepository jpaTeacherRepository) {
		super();
		this.jpaTeacherRepository = jpaTeacherRepository;
	}

	@Override
	public Optional<Teacher> getById(int id) {
		// TODO Auto-generated method stub
		return jpaTeacherRepository.findById(id).map(TeacherEntity::toDomainModel);
	}

	@Override
	public List<Teacher> listAll(String name) {
		// TODO Auto-generated method stub
		return jpaTeacherRepository.findAll().stream().map(TeacherEntity::toDomainModel).collect(Collectors.toList());
	}

	@Override
	public Teacher create(Teacher item) {
		// TODO Auto-generated method stub
		TeacherEntity teacherEntity = TeacherEntity.fromDomainModel(item);
		TeacherEntity createdTeacherEntity = jpaTeacherRepository.save(teacherEntity);
		return createdTeacherEntity.toDomainModel();
	}

	@Override
	public Optional<Teacher> update(Teacher item) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
