package com.arif.hasnat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.arif.hasnat.service.QuestionService;


@Controller
public class QuestionPage {
	
	@Autowired
	private QuestionService questionServices;
	
	@RequestMapping("questions")
	public String questions(Model model){
		model.addAttribute("question",questionServices.findAll());
		
		return "questions";
		
	}

}