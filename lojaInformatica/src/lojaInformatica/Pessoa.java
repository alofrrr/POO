package lojaInformatica;

import java.util.List;

//Sobrecarga

public class Pessoa {

	private String name;
	private String email;
	private String address;
	private List<String> phoneNumbers;

	public Pessoa(String name, String email, String address, List<String> phoneNumbers) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.phoneNumbers = phoneNumbers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
}
