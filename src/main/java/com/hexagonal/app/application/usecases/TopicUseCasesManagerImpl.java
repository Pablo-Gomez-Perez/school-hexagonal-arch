package com.hexagonal.app.application.usecases;

import java.util.List;
import java.util.Optional;

import com.hexagonal.app.domain.model.Topic;
import com.hexagonal.app.domain.ports.outputs.ModelDataManagerRepository;

public class TopicUseCasesManagerImpl implements ModelDataManagerRepository<Topic>{
	
	private final ModelDataManagerRepository<Topic> topicDataManagerRepository;
	
	public TopicUseCasesManagerImpl(ModelDataManagerRepository<Topic> topicDataManagerRepository) {
		this.topicDataManagerRepository = topicDataManagerRepository;
	}
	
	@Override
	public Optional<Topic> getById(int id) {
		// TODO Auto-generated method stub
		return this.topicDataManagerRepository.getById(id);
	}

	@Override
	public List<Topic> listAll(String name) {
		// TODO Auto-generated method stub
		return this.topicDataManagerRepository.listAll(name);
	}

	@Override
	public boolean create(Topic item) {
		// TODO Auto-generated method stub
		return this.topicDataManagerRepository.create(item);
	}

	@Override
	public Optional<Topic> update(Topic item) {
		// TODO Auto-generated method stub
		return this.topicDataManagerRepository.update(item);
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return this.topicDataManagerRepository.delete(id);
	}

	
	
}
