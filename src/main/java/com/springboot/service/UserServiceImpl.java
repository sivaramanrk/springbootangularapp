package com.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.model.UserRecord;
import com.springboot.repository.UserRepository;

@Component
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserRecord createUser(UserRecord user) {
		
		return userRepository.save(user);
	}

	@Override
	public List<UserRecord> getUserList() {
		
		return userRepository.findAll();
		
	}

	@Override
	public UserRecord getUserById(long id) {
		
		Optional<UserRecord> optional = userRepository.findById(id);
		UserRecord user = optional.get();
		
		return user;
	}

	@Override
	public String deleteById(Long userid) {
				
		userRepository.deleteById(userid);
		return "Deleted User Successfully";
	}

}
