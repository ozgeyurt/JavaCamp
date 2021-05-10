package eTrade;


import eTrade.business.abstracts.LoginService;

import eTrade.business.concretes.LoginManager;
import eTrade.business.concretes.SendMessageManager;
import eTrade.business.concretes.UserManager;
import eTrade.core.GoogleManagerAdapter;
import eTrade.dataAccess.concretes.HibernateUserDao;
import eTrade.entities.concretes.User;


public class Main {

	public static void main(String[] args) {
		User user=new User(1,"Özge","Ýnan","ozge.yurt@hotail.com","7896452");
		
		
		 UserManager userManager =new UserManager(new HibernateUserDao(),new SendMessageManager(), new GoogleManagerAdapter() ); 
		LoginService loginService= new LoginManager(userManager);
		userManager.add(user);
		loginService.login(user);
		
		
		
		

	
	}
}
