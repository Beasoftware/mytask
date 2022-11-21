package com.dev.neo.service;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.dev.neo.model.User;
import com.dev.neo.model.UserMaster;
import com.dev.neo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository repo;

	

	public List<User> listAll() {

		return repo.findAll();
	}


	public static Object searchUsersMaster(String query) {
		
		return null;
	}


	public UserMaster saveData(UserMaster usermaster) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
