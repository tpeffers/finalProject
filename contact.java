package finalProject;

public class contact {

	String firstName;
	String lastName;
	String phoneNum;
	Address address;  
	
	public contact() {
		super();
	}

	public contact(String firstName, String lastName, String phoneNum) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
	}

	public contact(String firstName, String lastName, String phoneNum, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String print() {

		return (firstName + " " + lastName + "\n" + phoneNum + "\n" + address.print());
		
	}

}
