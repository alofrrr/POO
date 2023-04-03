package Sistema;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Usuario {
	private String setor;
	private Producao producao;
	private List<Empregado> listaEmpregados;

	public Gerente(int id, String nome, String email, String senha, String tipo, String setor) {
		super(id, nome, email, senha, tipo);
		this.setor = setor;
		this.producao = new Producao(0);
		this.listaEmpregados = new ArrayList<>();
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public void gerenciarPedido(Pedido pedido) {
		if (producao.adicionarPedido(pedido)) {
			System.out.println("Pedido adicionado à lista de produção.");
		}
	}

	public void definirPrecoImpressao(double precoImpressao) {
		this.producao.setPrecoImpressao(precoImpressao);
	}

	public double calcularPrecoFinal(Pedido pedido) {
		return producao.calcularPrecoFinal(pedido);
	}

	public void adicionarFuncionario(Empregado novoEmpregado) {
		this.listaEmpregados.add(novoEmpregado);
	}

	public void incluirPedido(Pedido pedido) {
		this.producao.adicionarPedido(pedido);
	}

	public List<Pedido> listarPedidos() {
		return this.producao.getPedidos();
	}
}
