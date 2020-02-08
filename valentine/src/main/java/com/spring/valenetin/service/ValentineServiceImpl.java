package com.spring.valenetin.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.valenetin.dao.ValentineDAO;
import com.spring.valenetin.entity.ValentineEntity;
@Component
public class ValentineServiceImpl  implements ValentineService{
	
	@Autowired
	private ValentineDAO dao;

	public ValentineServiceImpl() 
	{
		System.out.println("creted\t"+getClass().getSimpleName());
	}

	public boolean validateAndSave(ValentineEntity entity) 
	{
		System.out.println("invoke validateSave"+entity);
		System.out.println("yet to validate");
		
		Integer id = dao.save(entity);
		if(Objects.nonNull(id))
		{
			System.out.println("entity save");
			return true;
		}
		System.out.println("entity not save");
		return false;
	}
	
}
