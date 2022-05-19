package com.ssafit.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafit.model.dao.UserDao;
import com.ssafit.model.dto.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;
	@Override
	public void createUser(User user) {
		userDao.insertUser(user);
	}

	@Override
	public boolean removeUser(String id) {
		if(userDao.deleteUser(id))
			return true;
		return false;
	}

	@Override
	public boolean modifyUser(User user) {
		if(userDao.updateUser(user))
			return true;
		return false;
	}

	@Override
	public User getUser(String id) {
		// TODO Auto-generated method stub
		return userDao.selectUser(id);
	}

	
}
