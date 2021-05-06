

import java.sql.Date;

public class Customer implements Entity{
	int id;
	String firstName;
	String lastName;
	int dateOfBrith;
	
	public Customer() {
		
	}
	
	public Customer(int id, String firstName, String lastName, int dateOfBrith, String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBrith = dateOfBrith;
		this.nationalityId = nationalityId;
	}
	String nationalityId;
	

}
