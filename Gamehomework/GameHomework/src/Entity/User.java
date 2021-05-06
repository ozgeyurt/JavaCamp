package Entity;
import java.sql.Date;

public class User extends Player{
	
private	String identityNumber;
private String FirstName;
private String lastName;
private int birthYear;

public User() {
	
}

public User(String identityNumber, String firstName, String lastName, int birthYear) {
	super();
	this.identityNumber = identityNumber;
	FirstName = firstName;
	this.lastName = lastName;
	this.birthYear = birthYear;
}

public String getIdentityNumber() {
	return identityNumber;
}

public void setIdentityNumber(String identityNumber) {
	this.identityNumber = identityNumber;
}

public String getFirstName() {
	return FirstName;
}

public void setFirstName(String firstName) {
	FirstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public int getBirthYear() {
	return birthYear;
}

public void setBirthYear(int birthYear) {
	this.birthYear = birthYear;
}



	

}
