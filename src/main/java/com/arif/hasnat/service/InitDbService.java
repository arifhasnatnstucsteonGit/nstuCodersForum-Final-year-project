package com.arif.hasnat.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.arif.hasnat.entity.Blog;
import com.arif.hasnat.entity.Item;
import com.arif.hasnat.entity.Role;
import com.arif.hasnat.entity.User;
import com.arif.hasnat.repository.BlogRepository;
import com.arif.hasnat.repository.ItemRepository;
import com.arif.hasnat.repository.RoleRepository;
import com.arif.hasnat.repository.UserRepository;


@Transactional
@Service
public class InitDbService {
	
	
	@Autowired
	private RoleRepository roleRepsitory;
	
	@Autowired
	private UserRepository userRepsitory;
	
	@Autowired
	private BlogRepository blogRepsitory;
	
	@Autowired
	private ItemRepository itemRepsitory;
	
	

	@PostConstruct
	public void init(){
		
		Role roleUser =new Role();
		roleUser.setName("ROLE_USER");
		roleRepsitory.save(roleUser);
		
			
		Role roleAdmin =new Role();
		roleAdmin.setName("ROLE_ADMIN");
		roleRepsitory.save(roleAdmin);
		
		User userAdmin= new User();
		userAdmin.setEnabled(true);
		userAdmin.setName("admin");
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		userAdmin.setPassword(encoder.encode("admin"));
		
		
		List<Role>  roles=new ArrayList<Role>();
		roles.add(roleAdmin);
		roles.add(roleUser);
		userAdmin.setRoles(roles);
		userRepsitory.save(userAdmin);
		
		Blog nstuCodersForum =new Blog();
		nstuCodersForum.setName("Spring application Delelopment");
		nstuCodersForum.setUrl("http://arifhasnat.com");
		nstuCodersForum.setUser(userAdmin);
		blogRepsitory.save(nstuCodersForum);
		
		Item item1=new Item();
		item1.setBlog(nstuCodersForum);
		item1.setTitle("first");
		item1.setLink("http://nstucodersforum.com");
		item1.setPblishedDate(new Date());
	    itemRepsitory.save(item1);
		
		
		

		Item item2=new Item();
		item2.setBlog(nstuCodersForum);
		item2.setTitle("second");
		item2.setLink("http://nstucodersforum.com");
		item2.setPblishedDate(new Date());
		itemRepsitory.save(item2);
		
		
		
		
	}
	

}
