
public class StarbucksCustomerManager extends BaseCustomerManager {
	private CustomerCheckService _customerCheckService;
public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		
		_customerCheckService=customerCheckService;
	}

	
	@Override
	public  void save(Customer customer) {
		if(_customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("saved to db"+ customer.firstName);
		}
		else {
			System.out.println("Not a valid person");
		}
	}
}
