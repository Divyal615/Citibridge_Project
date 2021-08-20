package com.citi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.citi.domain.userkey;

public interface LoginRepository extends JpaRepository<userkey, String>{

	public userkey findByIdAndPassword(String Id, String Password);
}
