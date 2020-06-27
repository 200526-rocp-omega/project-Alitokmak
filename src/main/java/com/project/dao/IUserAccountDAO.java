package com.project.dao;

import java.util.List;

import com.project.models.AbstractAccount;
import com.project.models.AbstractUser;
import com.project.models.UserAccount;

public interface IUserAccountDAO {
	// Due to the many-many relationship of the two tables, the 'find' methods need to be lists
	public int insert(int userId, int accountId); // Add record to the table
	public List<UserAccount> findAccountsByUser(int userId); // Grab a list of all accounts associated with user
	public List<UserAccount> findUsersByAccount(AbstractAccount a); // Grab a list of all users associated with an account (joint)
	public List<UserAccount> findAll(); // Allow employee / admin to see a list of all accounts
	public int deleteByUser(AbstractUser u); // Delete all rows pertaining to the user
	public int deleteByAccount(AbstractAccount a); // Delete all rows pertaining to a specific account.
}

/**
 * This is an interface that defines what methods we plan to use to
 * interact with the database.
 * 
 * We have methods for all 4 CRUD operations.
 * 
 * We additionally have a few extra helpful Read operations,
 * since they might come in handy.
 * 
 * It is good design to have an interface for our DAO classes.
 */

