package com.arif.hasnat.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.arif.hasnat.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
