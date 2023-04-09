package com.netflix.springpractise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.netflix.springpractise.dto.Studentdto;

@Repository
public interface UserRepository extends JpaRepository<Studentdto, String>{

}
