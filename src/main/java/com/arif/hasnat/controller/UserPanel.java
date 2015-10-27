package com.arif.hasnat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserPanel {
	
	@RequestMapping("userPanel")
	public String userPanels(){
		
		return "userPanel";
		
	}
	
	

}
