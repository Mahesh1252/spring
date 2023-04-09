package com.netflix.springpractise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.springpractise.dao.Studentdao;
import com.netflix.springpractise.dto.Studentdto;

@RestController
public class Studentcontroller {

	 @Autowired
	 Studentdao studentdao;
	 
	 @PostMapping("/signin")
	 public void save(@RequestBody Studentdto studentdto)
	 {
		 studentdao.insert(studentdto);
	 }
}
