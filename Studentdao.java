package com.netflix.springpractise.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.netflix.springpractise.dto.Studentdto;
import com.netflix.springpractise.repository.UserRepository;

@Component
public class Studentdao {

	@Autowired
	UserRepository repository;
	
	public void insert(Studentdto studentdto)
	{
		repository.save(studentdto);
	}
}
