package com.company.inventory.services;

import org.springframework.http.ResponseEntity;

import com.company.inventory.model.Category;
import com.company.inventory.response.CategoryResponseRest;

//Todos los servicios del front se guardan aqui 
public interface ICategoryService {

	public ResponseEntity<CategoryResponseRest> search(); //busca todo general
	public ResponseEntity<CategoryResponseRest> searchById(Long id); //busca por id 
	public ResponseEntity<CategoryResponseRest> save(Category category); //guardar categoria
	public ResponseEntity<CategoryResponseRest> update(Category category, Long id); //actualizar caregoia
	public ResponseEntity<CategoryResponseRest> deleteById(Long id); //elimina un registro por id
		
	 
}
