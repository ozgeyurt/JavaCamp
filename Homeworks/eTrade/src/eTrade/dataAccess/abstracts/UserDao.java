package eTrade.dataAccess.abstracts;

import java.util.List;

import eTrade.entities.concretes.User;

public interface UserDao {
	
	void add(User user);
	
	void delete(User user);
	
	List<User>getall();

}
