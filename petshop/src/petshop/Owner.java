package petshop;

public class Owner {
	private String name;
	private Integer clientCode;
	private String address;
	private String cpf;
	
	public Owner(String name, Integer clientCode, String address, String cpf) {
		super();
		this.name = name;
		this.clientCode = clientCode;
		this.address = address;
		this.cpf = cpf;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getClientCode() {
		return clientCode;
	}
	
	public void setClientCode(Integer clientCode) {
		this.clientCode = clientCode;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
