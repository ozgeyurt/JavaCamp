package eTrade.business.concretes;


import eTrade.business.abstracts.LoginService;
import eTrade.business.abstracts.UserService;
import eTrade.entities.concretes.User;

public class LoginManager implements LoginService {
	
	private UserService userService;

	public LoginManager(UserService userService) {
		
		this.userService = userService;
	}

	@Override
	public void register(User user) {
		this.userService.add(user);
		
	}

	@Override
	public void login(User user) {
		
		if(!emailControl(user.geteMail())) {
			System.out.println("email hatalý");
		}
		
		if(!passwordControl(user.getPassword())) {
			System.out.println("parola hatalý");
		}
		
		
	}
	
	
	public boolean emailControl(String email) {
		for(User user:userService.GetAll()) {
			if(user.geteMail()==email) {
				return true;
		}
		}
		return false;
		
	}
	
	public boolean passwordControl(String password) {
		for(User user:userService.GetAll()) {
			if(user.getPassword()==password) {
				return true;
			}
			
		}
		return false;
		
	}

}
