package com.arif.hasnat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arif.hasnat.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

	Role findByName(String name);

}
