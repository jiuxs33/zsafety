package com.zsafety.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zsafety.dao.UserDao;
import com.zsafety.model.TUser;
import com.zsafety.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired 
	UserDao userDao;
	
	@Override
	public TUser findUserById(Long id) {
		// TODO Auto-generated method stub
		return userDao.single(id);
	}

	@Override
	public List<TUser> findUserByName(TUser user) {
		// TODO Auto-generated method stub
		return userDao.findUserByName(user);
	}
}
