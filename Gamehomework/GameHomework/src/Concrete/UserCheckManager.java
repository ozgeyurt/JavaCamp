package Concrete;

import Abstract.UserCheckService;
import Entity.User;

public class UserCheckManager implements UserCheckService {

	@Override
	public boolean CheckIfRealPerson(User user) {
		
		return true;
	}

}
