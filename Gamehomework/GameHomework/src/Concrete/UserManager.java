package Concrete;

import Abstract.UserCheckService;
import Abstract.UserService;
import Entity.User;

public class UserManager implements UserService{
	
	private UserCheckService userCheckService;
	
	public  UserManager(UserCheckService userCheckService) {
		this.userCheckService=userCheckService;
	}

	@Override
	public void add(User user) {
		if(userCheckService.CheckIfRealPerson(user)) {
			System.out.println(user.getFirstName()+ "kullanýcýsý eklendi");
		}
		else {
			System.out.println("ekleme baþarýsýz!");
		}
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName()+" adlý kullanýcý silindi");
		
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+" adlý kullanýcý güncellendi");
		
		
	}

}
