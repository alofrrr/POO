package FusãoContraçãoGrafos;


import java.util.List;

public class Vertice {
	private Integer valor;
	private List <Integer> adjacentes;
	
	public Vertice() {
		super();
	}
	
	public Vertice(Integer valor, List<Integer> adjacentes) {
		super();
		this.valor = valor;
		this.adjacentes = adjacentes;
	}
	
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	public List<Integer> getAdjacentes() {
		return adjacentes;
	}
	public void setAdjacentes(List<Integer> adjacentes) {
		this.adjacentes = adjacentes;
	}
	
	

}