
public class BaseCustomerManager implements CustomerService {

	@Override
	public  void save(Customer customer) {
		System.out.println("saved to db"+ customer.firstName);
		
	}

}
