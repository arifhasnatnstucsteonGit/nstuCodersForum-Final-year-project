package com.arif.hasnat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.arif.hasnat.entity.UserBlog;

import com.arif.hasnat.service.UserBlogService;



@Controller
public class UserBlogController {
	
	@Autowired
	private UserBlogService userBlogServices;
	
	@RequestMapping("/userBlog")
	public String questions(){
		
		
		return "userBlog";
		
	}
	
	
	@ModelAttribute("userBlogs")
	public UserBlog construct(){
		return new UserBlog();
		
		
		
	}
	
	@RequestMapping(value="/userBlog",method=RequestMethod.POST)
	public String post_questions(@ModelAttribute("userBlogs") UserBlog userBlog){
		
		userBlogServices.save(userBlog);
		
		return "userBlog";
		
	}

}