package eTrade.business.abstracts;

import java.util.List;

import eTrade.entities.concretes.User;

public interface UserService {
	void add(User user);
	
	List<User>GetAll();
	

}
