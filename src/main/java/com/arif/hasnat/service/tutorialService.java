package com.arif.hasnat.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.arif.hasnat.entity.tutorial;
import com.arif.hasnat.repository.BlogRepository;
import com.arif.hasnat.repository.QuestionRepository;
import com.arif.hasnat.repository.ItemRepository;
import com.arif.hasnat.repository.RoleRepository;
import com.arif.hasnat.repository.UserRepository;
import com.arif.hasnat.repository.tutorialRepository;




@Service
@Transactional
public class tutorialService {
	
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private UserRepository userRepsitory;
	
	@Autowired
	private BlogRepository blogRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	
	@Autowired
	private QuestionRepository questionRepository;
	@Autowired
	private tutorialRepository tutorialRepository;

	public void save(tutorial tutorial) {
		tutorialRepository.save(tutorial);
		
	}

	
	
    public List<tutorial> findAll(){
		return tutorialRepository.findAll();
		
		
	}
}
	