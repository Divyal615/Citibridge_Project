package com.citi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.citi.domain.userkey;
import com.citi.repository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	private LoginRepository repo;

	public boolean checkUserId(String Id) {
		
		return repo.existsById(Id);
	}
	public boolean fetchuser(userkey user) {
		return repo.exists((Example<userkey>) user);
	}
	
	public userkey fetchUserByIdAndPassword(String id, String password) {
		return repo.findByIdAndPassword(id, password);
	}

	
}
