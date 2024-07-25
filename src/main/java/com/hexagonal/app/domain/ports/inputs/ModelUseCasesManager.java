package com.hexagonal.app.domain.ports.inputs;

import java.util.List;
import java.util.Optional;

/**
 * 
 * @param <T>
 */
public interface ModelUseCasesManager <T> {
	
	public Optional<T> getById(int id);
	
	public List<T> listAll(String name);
	
	public T create(T item);
	
	public Optional<T> update(T item);
	
	public boolean delete(int id);
	
}
