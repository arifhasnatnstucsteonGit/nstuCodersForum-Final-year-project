package com.arif.hasnat.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arif.hasnat.entity.Blog;
import com.arif.hasnat.entity.Item;


public interface ItemRepository extends JpaRepository<Item, Integer>{
	
  List<Item> findByBlog(Blog blog); 
}
