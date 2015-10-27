package com.arif.hasnat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.arif.hasnat.entity.tutorial;
import com.arif.hasnat.service.tutorialService;

@Controller
public class tutorialController {
	
	@Autowired
	private tutorialService tutorialServices;
	
	@RequestMapping("/tutorial")
	public String questions(){
		
		
		return "tutorial";
		
	}
	
	
	@ModelAttribute("tutorials")
	public tutorial construct(){
		return new tutorial();
		
		
		
	}
	
	@RequestMapping(value="/tutorial",method=RequestMethod.POST)
	public String post_questions(@ModelAttribute("tutorials") tutorial tutorial){
		
		tutorialServices.save(tutorial);
		
		return "tutorial";
		
	}

}
