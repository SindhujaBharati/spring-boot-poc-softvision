package com.softvision.springFramework.web.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softvision.springFramework.web.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer>{
	List<Todo> findByUser(String user);
	

}