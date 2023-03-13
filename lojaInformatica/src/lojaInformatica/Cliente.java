package lojaInformatica;

import java.util.Date;
import java.util.List;

public class Cliente extends Pessoa {

	private Date dateOfBirth;
	private String cpf;

	public Cliente(String name, String email, String address, List<String> phoneNumbers, Date dateOfBirth, String cpf) {
		super(name, email, address, phoneNumbers);
		this.dateOfBirth = dateOfBirth;
		this.cpf = cpf;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}