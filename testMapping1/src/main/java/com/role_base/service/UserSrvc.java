package com.role_base.service;

import java.util.List;

import com.role_base.model.User;

public interface UserSrvc {

	public List<User> getAll();
	
	public User getById(Long User_id);
	
	public String addUser(User User);
	
	public String deleteUser(Long id);
	
	public User assignCourse(Long User_id,Long Course_Id);
}
