package com.company.inventory.services;

import org.springframework.http.ResponseEntity;
import com.company.inventory.response.CategoryResponseRest;

public interface ICategoryService {

	public ResponseEntity<CategoryResponseRest> search(); //busca todo general
	public ResponseEntity<CategoryResponseRest> searchById(Long id); //busca por id 
	
	
	
	
	 
}
