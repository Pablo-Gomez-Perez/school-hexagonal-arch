package com.hexagonal.app.domain.model;

public class Topic {
	
	private int idTopic;
	private String name;
	private String description;
	
	public Topic(int idTopic, String name, String description) {
		super();
		this.idTopic = idTopic;
		this.name = name;
		this.description = description;
	}
	
	public Topic() {
		
	}	
	
	public int getIdTopic() {
		return idTopic;
	}

	public void setIdTopic(int idTopic) {
		this.idTopic = idTopic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
