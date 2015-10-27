package com.arif.hasnat.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


import com.arif.hasnat.entity.Blog;
import com.arif.hasnat.entity.Item;
import com.arif.hasnat.entity.Role;
import com.arif.hasnat.entity.User;
import com.arif.hasnat.repository.BlogRepository;
import com.arif.hasnat.repository.QuestionRepository;
import com.arif.hasnat.repository.ItemRepository;
import com.arif.hasnat.repository.RoleRepository;
import com.arif.hasnat.repository.UserRepository;



@Service
@Transactional
public class UserService {
	
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private UserRepository userRepsitory;
	
	@Autowired
	private BlogRepository blogRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	
	@Autowired
	private QuestionRepository categoryRepository;
	
	public List<User> findAll(){
		return userRepsitory.findAll();
		
		
	}

	public User  findOne(int id) {
		
		return userRepsitory.findOne(id);
	}

	@Transactional
	public User findOneWithBlogs(int id) {
		User user=findOne(id);
		
		List<Blog> blogs=blogRepository.findByUser(user);
		for(Blog blog:blogs){
			
			List<Item> items= itemRepository.findByBlog(blog);
			blog.setItems(items);
			
			
		}
		
		user.setBlogs(blogs);
		
		
		return user;
	}

	public void save(User user) {
		user.setEnabled(true);
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		user.setPassword(encoder.encode(user.getPassword()));
		
		List<Role> roles=new ArrayList<Role>();
		roles.add(roleRepository.findByName("ROLE_USER"));
		user.setRoles(roles);
		
		
		userRepsitory.save(user);
	}

	public void delete(int id) {
		userRepsitory.delete(id);
		
	}
		
	
		

	

}
