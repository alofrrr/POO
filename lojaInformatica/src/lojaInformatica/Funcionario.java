package lojaInformatica;

import java.util.Date;
import java.util.List;

public class Funcionario extends Pessoa {

	private Date hireDate;
	private String position;
	private String cpf;
	private Date dateOfBirth;

	public Funcionario(String name, String email, String address, List<String> phoneNumbers, Date dateOfBirth,
			String cpf, Date hireDate, String position) {
		super(name, email, address, phoneNumbers);
		this.hireDate = hireDate;
		this.position = position;
		this.cpf = cpf;
		this.dateOfBirth = dateOfBirth;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
