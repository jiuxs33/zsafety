package com.zsafety.service;

import java.util.List;

import com.zsafety.model.TUser;

public interface UserService {

	public TUser findUserById(Long id);
	
	public List<TUser> findUserByName(TUser user);
}
