package com.hexagonal.app.domain.ports.outputs;

import java.util.List;
import java.util.Optional;

public interface ModelDataManagerRepository <T> {
	
public Optional<T> getById(int id);
	
	public List<T> listAll(String name);
	
	public T create(T item);
	
	public Optional<T> update(T item);
	
	public boolean delete(int id);
	
}
