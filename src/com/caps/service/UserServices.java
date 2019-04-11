package com.caps.service;

import com.caps.beans.User;
import com.caps.dao.RepoImpl;
import com.caps.dao.UserDAO;

public class UserServices {
	public User userLogin(String userId, String passwd) {
		UserDAO dao = new RepoImpl();
		User u = dao.login(userId, passwd);
		return u;
	}
}
