package com.spring.valenetin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.valenetin.entity.ValentineEntity;
import com.spring.valenetin.service.ValentineServiceImpl;

public class SpringTester 
{
	public static void main(String[] args)
	{
		try
		{
			ApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
			ValentineServiceImpl refOfValentineServiceImpl = container.getBean(ValentineServiceImpl.class);
			
			ValentineEntity entity = new ValentineEntity();
			entity.setId(1);
			entity.setName("eswer");
			entity.setStatus("double");
			entity.setGift("ring");
			entity.setAmmountSpent(420);
			
			refOfValentineServiceImpl.validateAndSave(entity);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
