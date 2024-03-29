package com.arif.hasnat.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arif.hasnat.entity.Blog;

import com.arif.hasnat.entity.User;

public interface BlogRepository extends JpaRepository<Blog, Integer>{
	
	
	List<Blog> findByUser(User user);
	

}
