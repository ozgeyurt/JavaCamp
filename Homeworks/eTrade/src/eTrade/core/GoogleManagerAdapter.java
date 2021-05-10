package eTrade.core;

import GoogleLogin.GoogleManager;
import eTrade.business.abstracts.LoginService;
import eTrade.entities.concretes.User;

public class GoogleManagerAdapter implements LoginService {

	@Override
	public void register(User user) {
		GoogleManager manager=new GoogleManager();
		manager.register(user);
		
		
	}

	@Override
	public void login(User user) {
		GoogleManager manager=new GoogleManager();
		manager.login(user);
		
		
	}

	
		
	

}
