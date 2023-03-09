package petshop;

public class AnimalBelonging {
	
	private Integer clientCode;
	private Integer animalCode;
	
	public AnimalBelonging(Integer clientCode, Integer animalCode) {
		this.clientCode = clientCode;
		this.animalCode = animalCode;
	}
	
	public Integer getClientCode() {
		return clientCode;
	}
	
	public void setClientCode(Integer clientCode) {
		this.clientCode = clientCode;
	}
	
	public Integer getAnimalCode() {
		return animalCode;
	}
	
	public void setAnimalCode(Integer animalCode) {
		this.animalCode = animalCode;
	}
}
