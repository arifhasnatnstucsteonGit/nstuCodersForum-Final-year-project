package com.arif.hasnat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.arif.hasnat.entity.Question;
import com.arif.hasnat.service.QuestionService;

@Controller	
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;

	@RequestMapping("/question")
	public String questions(){
		
		return "user_Question";
		
	}
	
//	@RequestMapping("/questionAns")
//	public String questionsAns(){
//		
//		return "questions";
//		
//	}
//	@RequestMapping("/questions")
//	public String questionsAns(Model model){
//		model.addAttribute("questions",questionService.findAll());
//		return "questions";
//		
//		
//	}
	
	@ModelAttribute("ques")
	public Question construct(){
		return new Question();
		
		
		
	}
	
	@RequestMapping(value="/question",method=RequestMethod.POST)
	public String post_questions(@ModelAttribute("ques") Question question){
		
		questionService.save(question);
		
		return "user_Question";
		
	}
	
}
