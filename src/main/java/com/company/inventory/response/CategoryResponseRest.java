package com.company.inventory.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

//herencia de responseRest a esta clase 
    public class CategoryResponseRest extends ResponseRest{
	private CategoryResponse categoryResponse =new CategoryResponse();
	
}