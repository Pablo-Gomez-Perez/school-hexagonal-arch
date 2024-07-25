package com.hexagonal.app.infrastructure.entities;

import java.time.LocalDateTime;

import com.hexagonal.app.domain.model.Topic;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity()
public class TopicEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTopic;
	private String name;
	private String description;
	private LocalDateTime creationDate;

	public TopicEntity(int idTopic, String name, String description, LocalDateTime creationDate) {
		super();
		this.idTopic = idTopic;
		this.name = name;
		this.description = description;
		this.creationDate = creationDate;
	}

	public TopicEntity() {
		super();
	}

	public static TopicEntity fromDomainModel(Topic topic) {
		return new TopicEntity(topic.getIdTopic(), topic.getName(), topic.getDescription(), LocalDateTime.now());
	}
	
	public Topic toDomainModel() {
		return new Topic(idTopic,name,description);
				
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

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

}
