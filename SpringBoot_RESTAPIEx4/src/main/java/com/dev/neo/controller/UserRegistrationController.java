package com.dev.neo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dev.neo.model.User;
import com.dev.neo.model.UserMaster;
import com.dev.neo.repository.UserMasterRepository;
import com.dev.neo.service.UserService;

@RestController
@RequestMapping("/api")
public class UserRegistrationController {
	@Autowired
	UserService service;
	@Autowired
	UserMasterRepository usermasterrepo;

	@RequestMapping({ "/hellouser" })
	public String helloUser() {
		return "Hello User";
	}

	@RequestMapping({ "/helloadmin" })
	public String helloAdmin() {
		return "Hello Admin";
	}

	@PostMapping("/usersMaster")
	public String addUser(@RequestBody UserMaster usermaster) {
		UserMaster um = new UserMaster();

		um.setFirstname(usermaster.getFirstname());
		um.setLastname(usermaster.getLastname());
		um.setEmailid(usermaster.getEmailid());

		um.setUsercontacts(usermaster.getUsercontacts());

		um.setUser(usermaster.getUser());

		usermasterrepo.save(um);
		return "User register !!";
	}

	@GetMapping("/users")
	public List<User> list() {
		return service.listAll();
	}

	@GetMapping("/searchusermaster")
	public ResponseEntity<Object> searchUsersMaster(@RequestParam("query") String query) {
		return ResponseEntity.ok(UserService.searchUsersMaster(query));

	}

}// end class
