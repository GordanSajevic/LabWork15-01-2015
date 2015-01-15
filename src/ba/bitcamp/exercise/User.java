package ba.bitcamp.exercise;

public class User {
	
	private String firstName;
	private String lastName;
	private int age;
	private boolean driverLicence;
	
	public User(String firstName, String lastName, int age, boolean driverLicence)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.driverLicence = driverLicence;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isDriverLicence() {
		return driverLicence;
	}

	public void setDriverLicence(boolean driverLicence) {
		this.driverLicence = driverLicence;
	}
	
	public String toCSV(String delimiter)
	{
		return firstName + delimiter + lastName + delimiter + String.valueOf(age) + delimiter +String.valueOf(driverLicence);
	}

}
