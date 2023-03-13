package lojaInformatica;

import java.util.ArrayList;

//encapsulamento em todas, pois sao private

public class Venda {
	private ArrayList<Cliente> customer;
	private ArrayList<Produto> product;
	private ArrayList<Funcionario> employee;
	private Double totalValue;
	private Double finalValue;

	public Venda(ArrayList<Cliente> customer, ArrayList<Produto> product, ArrayList<Funcionario> employee,
			Double totalValue, Double finalValue) {
		super();
		this.customer = customer;
		this.product = product;
		this.employee = employee;
		this.totalValue = totalValue;
		this.finalValue = finalValue;
	}

	public ArrayList<Cliente> getCustomer() {
		return customer;
	}

	public void setCustomer(ArrayList<Cliente> customer) {
		this.customer = customer;
	}

	public ArrayList<Produto> getProduct() {
		return product;
	}

	public void setProduct(ArrayList<Produto> product) {
		this.product = product;
	}

	public ArrayList<Funcionario> getEmployee() {
		return employee;
	}

	public void setEmployee(ArrayList<Funcionario> employee) {
		this.employee = employee;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public Double getFinalValue() {
		return finalValue;
	}

	public void setFinalValue(Double finalValue) {
		this.finalValue = finalValue;
	}
	
	//polimofismo

	public void getFinalValueWithDiscount(String cpf) {
		double finalValue = 0.0;

		for (Cliente cust : customer) {
			if (cust.getCpf().equals(cpf)) {
				System.out.println("Nome: " + cust.getName());
				finalValue = calculateDiscountedValue(totalValue, 0.9);
				System.out.println("Valor Final Cliente: " + finalValue);
				return;
			}
		}

		for (Funcionario emp : employee) {
			if (emp.getCpf().equals(cpf)) {
				System.out.println("Nome: " + emp.getName());
				finalValue = calculateDiscountedValue(totalValue, 0.8);
				System.out.println("Valor Final Funcionario: " + finalValue);
				return;
			}
		}

		System.out.println("Valor Total: " + totalValue);
		finalValue = calculateDiscountedValue(totalValue, 0.95);
		System.out.println("Valor Final Novo Cliente R$: " + finalValue);
	}

	private double calculateDiscountedValue(double totalValue, double discount) {
		return totalValue * discount;
	}

}