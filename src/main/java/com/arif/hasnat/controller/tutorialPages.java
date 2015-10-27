package com.arif.hasnat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.arif.hasnat.service.tutorialService;

@Controller
public class tutorialPages {
	
	@Autowired
	private tutorialService tutorialServices;
	
	@RequestMapping("tutorialPage")
	
	public String questions(Model model){
		model.addAttribute("turorial",tutorialServices.findAll());
		
		return "tutorialPage";
		
	}

}
