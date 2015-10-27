package com.arif.hasnat.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arif.hasnat.entity.UserBlog;
import com.arif.hasnat.repository.userBlogRepository;




@Service
@Transactional
public class UserBlogService {
	
	
	@Autowired
	private userBlogRepository userBlogRepositories;
	

	public void save(UserBlog userBlog) {
		userBlogRepositories.save(userBlog);
		
	}
	
	
	
	
	public List<UserBlog> findAll(){
		return userBlogRepositories.findAll();
		
		
	}
	
	
	
	
	
	

}
