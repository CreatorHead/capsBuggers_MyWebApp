package com.caps.repo;

import java.util.ArrayList;

import com.caps.beans.User;

public class UserRepo {
	
	public ArrayList<User> users = new ArrayList<>();
	
	public UserRepo() {
		User u1 = new User();
		u1.setEmail("Abhijit@gmail.com");
		u1.setName("Abhijit");
		u1.setPassword("root");
		u1.setUserId("1");
		
		User u2 = new User();
		u2.setEmail("Shabnam@gmail.com");
		u2.setName("Shabnam");
		u2.setPassword("root");
		u2.setUserId("2");
		
		User u3 = new User();
		u3.setEmail("Bhaskar@gmail.com");
		u3.setName("Bhaskar");
		u3.setPassword("root");
		u3.setUserId("3");
		
		users.add(u1);
		users.add(u2);
		users.add(u3);
		
	}
	
	
}
