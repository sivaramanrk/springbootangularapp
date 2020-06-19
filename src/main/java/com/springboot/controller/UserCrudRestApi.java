package com.springboot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.UserRecord;
import com.springboot.service.UserService;

@RestController
@RequestMapping("/app/user")
public class UserCrudRestApi {

	@Autowired
	UserService userService;

	@PostMapping("/create")
	@CrossOrigin(origins = "http://localhost:4200")
	public UserRecord createUser(@Valid @RequestBody UserRecord user) {

		UserRecord vendorresponse = userService.createUser(user);
		return vendorresponse;
	}

	@GetMapping("/userlist")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<UserRecord> getAllCustomers() {

		return userService.getUserList();
	}
	
	@RequestMapping(path = "/userrecord/{id}", method = RequestMethod.GET)
	@CrossOrigin(origins = "http://localhost:4200")
	public UserRecord getUserRecordById(@PathVariable(value = "id") long id) {

		return userService.getUserById(id);

	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/user/{id}")
	public ResponseEntity<Map<String, String>> deleteCustomer(@PathVariable(value = "id") Long userid) {
		System.out.println("userid "+userid);

		String response = userService.deleteById(userid);

		Map<String, String> responsemap = new HashMap<String, String>();
		responsemap.put("status", response);

		return ResponseEntity.ok(responsemap);

	}
	
	

}
