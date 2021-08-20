package com.citi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citi.domain.userkey;
import com.citi.repository.LoginRepository;
import com.citi.service.LoginService;

@RestController
@RequestMapping(value="/users")
public class LoginController {

	
	@Autowired
	LoginRepository repo;
	@GetMapping(value="/all")
	public List<userkey> getAll(){
		return repo.findAll();
	}
	
//	@Autowired
//	private LoginService service;
//	
//	@PostMapping(value="/login")
//	public userkey checkUser(@RequestBody userkey user) throws Exception {
//		
//		String tempId=user.getId();
//		String tempPass=user.getPassword();
//		//userkey u1=null;
//		if(tempId!=null&&tempPass!=null)
//		{
//			if(service.fetchuser(user)) {
//				return user;
//			}
//			else
//				throw new Exception("Bad credentials");
//		}
//		else
//		{
//			throw new Exception("Bad credentials");
//		}
//				
//	}
	
	private LoginService service;
	
	@PostMapping("/login")
	public userkey loginUser(@RequestBody userkey user) throws Exception {
		
		String tempId=user.getId();
		String tempPassword=user.getPassword();
		userkey u1=null;
		if(tempId!=null&&tempPassword!=null) {
			u1=service.fetchUserByIdAndPassword(tempId, tempPassword);
		}
		if(u1==null)
		{
			throw new Exception("Bad credentials");
		}
		return u1;
	}
	
}
