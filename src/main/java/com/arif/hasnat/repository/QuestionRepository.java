package com.arif.hasnat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arif.hasnat.entity.Question;


public interface QuestionRepository extends JpaRepository<Question, Integer>{

}
