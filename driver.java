package finalProject;

public class driver {

	public static void main(String[] args) {

		Address x = new Address();

		x.setStreetName("West Hanover Dr");
		x.setHouseNumber("14A");
		x.setCity("Missoula");
		x.setState("MT");
		x.setZipCode("00001");

		contact y = new contact();
		y.setFirstName("Tyler");
		y.setLastName("Peffers");
		y.setPhoneNum("515-888-8888");
		y.setAddress(x);

		System.out.println(y.print());

	}

}
