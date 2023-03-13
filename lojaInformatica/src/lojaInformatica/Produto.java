package lojaInformatica;

public class Produto {
	
	private int id;
	private String name;
	private Double unit_price;
	private Fornecedor supplier;
	
	public Produto(int id, String name, Double unit_price, Fornecedor supplier) {
		this.id = id;
		this.name = name;
		this.unit_price = unit_price;
		this.supplier = supplier; 
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getUnit_price() {
		return unit_price;
	}
	
	public void setUnit_price(Double unit_price) {
		this.unit_price = unit_price;
	}
	
	public Fornecedor getSupplier() {
		return supplier;
	}
	
	public void setSupplier(Fornecedor supplier) {
		this.supplier = supplier;
	}
}
