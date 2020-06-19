package com.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.model.UserRecord;

@Service
public interface UserService {
	
	UserRecord createUser(UserRecord user);
	
	List<UserRecord> getUserList();

	UserRecord getUserById(long id);
	
	String deleteById(Long userid);
}
