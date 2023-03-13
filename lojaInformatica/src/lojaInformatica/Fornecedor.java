package lojaInformatica;

import java.util.Date;
import java.util.List;

public class Fornecedor extends Pessoa {

private Date openingDate;
private String cnpj;

public Fornecedor(String name, String email, String address, List<String> phoneNumbers, Date openingDate,
		String cnpj) {
	super(name, email, address, phoneNumbers);
	this.openingDate = openingDate;
	this.cnpj = cnpj;
}

public Date getOpeningDate() {
	return openingDate;
}

public void setOpeningDate(Date openingDate) {
	this.openingDate = openingDate;
}

public String getCnpj() {
	return cnpj;
}

public void setCnpj(String cnpj) {
	this.cnpj = cnpj;
}
}