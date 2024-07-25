package com.hexagonal.app.infrastructure.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexagonal.app.infrastructure.entities.TopicEntity;

public interface JpaTopicRepository extends JpaRepository<TopicEntity, Integer>{

}
