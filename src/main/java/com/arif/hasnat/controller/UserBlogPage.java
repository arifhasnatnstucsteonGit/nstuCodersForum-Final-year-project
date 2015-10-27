package com.arif.hasnat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.arif.hasnat.service.UserBlogService;


@Controller
public class UserBlogPage {
	
	@Autowired
	private UserBlogService userBlogServices;
	
	@RequestMapping("userBlogPage")
	
	public String questions(Model model){
		model.addAttribute("userBlog",userBlogServices.findAll());
		
		return "userBlogPage";
		
	}

}