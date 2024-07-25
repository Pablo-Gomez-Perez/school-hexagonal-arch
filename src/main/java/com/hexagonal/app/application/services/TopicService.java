package com.hexagonal.app.application.services;

import java.util.List;
import java.util.Optional;

import com.hexagonal.app.domain.model.Topic;
import com.hexagonal.app.domain.ports.inputs.ModelUseCasesManager;

public class TopicService implements ModelUseCasesManager<Topic> {

	private final ModelUseCasesManager<Topic> topicUseCasesManager;	
	
	public TopicService(ModelUseCasesManager<Topic> topicUseCasesManager) {
		super();
		this.topicUseCasesManager = topicUseCasesManager;
	}
		
	
	@Override
	public Optional<Topic> getById(int id) {
		// TODO Auto-generated method stub
		return this.topicUseCasesManager.getById(id);
	}

	@Override
	public List<Topic> listAll(String name) {
		// TODO Auto-generated method stub
		return this.topicUseCasesManager.listAll(name);
	}

	@Override
	public boolean create(Topic item) {
		// TODO Auto-generated method stub
		return this.topicUseCasesManager.create(item);
	}

	@Override
	public Optional<Topic> update(Topic item) {
		// TODO Auto-generated method stub
		return this.topicUseCasesManager.update(item);
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return this.topicUseCasesManager.delete(id);
	}

	
	
}
