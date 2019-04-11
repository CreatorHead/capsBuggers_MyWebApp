package com.caps.dao;

import com.caps.beans.User;

public interface UserDAO {
	
	User login(String userId, String passwd);
}
