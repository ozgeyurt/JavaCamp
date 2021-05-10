package eTrade.business.abstracts;

import eTrade.entities.concretes.User;

public interface LoginService {
	void register(User user);
	void login(User user);

}
