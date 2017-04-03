package finalProject;

public class Address {

	String streetName;
	String houseNumber;
	String city;
	String state;
	String zipCode;

	public Address() {
		super();
	}

	public Address(String streetName, String houseNumber, String city, String state, String zipCode) {
		super();
		this.streetName = streetName;
		this.houseNumber = houseNumber;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String print() {

		return (houseNumber + streetName + "\n" + city + ", " + state + " " + zipCode);
	}

}
