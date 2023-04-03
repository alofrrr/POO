package Sistema;

import java.util.ArrayList;
import java.util.List;

public class Producao {
	private List<Pedido> pedidos;
	private double precoImpressao;

	public Producao(double precoImpressao) {
		this.pedidos = new ArrayList<>();
		this.precoImpressao = precoImpressao;

	}

	public boolean adicionarPedido(Pedido pedido) {
		return pedidos.add(pedido);
	}

	public void setPrecoImpressao(double precoImpressao) {
		this.precoImpressao = precoImpressao;
	}

	public double calcularPrecoFinal(Pedido pedido) {
		return precoImpressao * pedido.getQuantidade();
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public double getPrecoImpressao() {
		return precoImpressao;
	}

}