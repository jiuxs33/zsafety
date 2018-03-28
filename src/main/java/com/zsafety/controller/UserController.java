package com.zsafety.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zsafety.model.TUser;
import com.zsafety.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService service;
	
	@RequestMapping(value="/findById/{id}.json")
	@ResponseBody
	public TUser findUserById(@PathVariable("id") Long id){
		return service.findUserById(id);
	}
	
	
	@RequestMapping(value="/findByName/{name}.json")
	@ResponseBody
	public TUser findUserById(@PathVariable("name") String name){
		TUser user = new TUser();
		user.setName(name);
		return service.findUserByName(user).get(0);
	}
	
}
