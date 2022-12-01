package com.role_base.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.role_base.model.User;
import com.role_base.serviceImpl.IUser;

@RestController
@RequestMapping("/User")
public class UserController {

	@Autowired
	private IUser Simpl;
	
	@GetMapping("/all")
	public List<User> getAll(){
		return Simpl.getAll();
		
	}
	
	@GetMapping("/{id}")
	public User getById(@PathVariable Long id) {
		return Simpl.getById(id);
	}
	
	@PostMapping("/add")
	public String addUser(@RequestBody User User) {
		Simpl.addUser(User);
		return "studnet Added";
	}
	
	@DeleteMapping("/{id}")
	public String removeUser(@PathVariable Long id) {
		Simpl.deleteUser(id);
		return "deleted";
	}
	
	@PutMapping("/{UserId}/course/{CourseId}")
	public User getUserWithCourse(@PathVariable Long UserId,@PathVariable Long CourseId ) {
		return Simpl.assignCourse(UserId, CourseId);
	}
	
}
