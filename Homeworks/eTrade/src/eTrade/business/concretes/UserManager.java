package eTrade.business.concretes;

import java.util.List;




import eTrade.core.Validation;
import eTrade.dataAccess.abstracts.UserDao;
import eTrade.business.abstracts.LoginService;
import eTrade.business.abstracts.SendMessage;
import eTrade.business.abstracts.UserService;
import eTrade.entities.concretes.User;



public class UserManager implements UserService {
	private UserDao userDao;
	private SendMessage sendMessage;
	private LoginService loginService;
	
	
	
	
	public UserManager(UserDao userDao,SendMessage sendMessage, LoginService loginService) {
		
		this.userDao = userDao;
		this.sendMessage= sendMessage;
		this.loginService=loginService;
		
	}
private boolean isEmailExist(String email) {
    for(User user:GetAll()) {
    	if(user.geteMail()==email) {
    		return true;
    	}
    	
    }
	
	return false;
	
}


	@Override
	public void add(User user) {
		if (user.getFirstName().length()<2 && user.getLastName().length()<2) {
			System.out.println("Ad Soyad en az iki karakter olmalý");
		}
	
		if(!Validation.validateEmail(user.geteMail())) {
			System.out.println("email geçersiz");
			}
		
		
		if (isEmailExist(user.geteMail())){
			System.out.println("email zaten var");
		}
		
		
		if(user.getPassword().length()!=6) {
			System.out.println("Parola 6 karakter olmalý");
			
		}
		this.userDao.add(user);
		System.out.println("Kayýt iþlemi baþarý ile gerçekleþti, onay kodu emailinize gönderildi"+user.geteMail());
		this.sendMessage.sendMail();
		this.loginService.login(user);
		
	}
	
	

	@Override
	public List<User> GetAll() {
		return userDao.getall();
	}
	



	

}
