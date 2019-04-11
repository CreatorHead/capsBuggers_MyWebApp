package com.caps.dao;

import com.caps.beans.User;
import com.caps.repo.UserRepo;

public class RepoImpl implements UserDAO {
	UserRepo db = new UserRepo();
	
	@Override
	public User login(String userId, String passwd) {
		User user = null;
		for(User u:db.users) {
			if(u.getUserId().equals(userId) 
					&& u.getPassword().equals(passwd)) {
				user = u;
			}
		}
		
		return user;
	}

}
