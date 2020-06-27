package com.project.models;

public class User extends AbstractUser{ // Abstracted out to super-class, no extra functionality here
	public User(int userId, String username, String password, String firstName, String lastName, String email,
			Role role) {
		super();
		this.setUserId( userId);
		this.setUsername(username);
		this.setPassword(password);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmail(email);
		this.setRole(role);
	}
	
	public User() {
		super();
	}
	
	

}
/**
 * This class is a Model class. This means that it is intended to simply store data.
 * 
 * Our model classes effectively mirror the corresponding tables.
 * The primary difference is that instead of storing int variables for Foreign Keys,
 * we actually go the extra step to obtain the entire object that the foreign key was
 * referencing.
 * 
 * That extra step is optional, but is a very common and convenient design choice.
 * 
 * We also generally create 2 constructors: One with zero parameters, and one with all parameters.
 * We provide getters/setters, and we also override hashcode(), equals(), and toString().
 * 
 * This particular class relates to the USERS table.
 */

