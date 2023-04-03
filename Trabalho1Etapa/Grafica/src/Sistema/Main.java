package Sistema;

import java.util.Date;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Gerente gerente = new Gerente(1, "Gerente", "gerente@sistema.com", "123456", "gerente", "Produção");
		Empregado empregado = new Empregado(2, "Empregado", "empregado@sistema.com", "123456", "empregado", "Produção");
		EmpregadoTerceirizado empregadoTerceirizado = new EmpregadoTerceirizado(3, "Empregado Terceirizado",
				"terceirizado@sistema.com", "123456", "Produção");

		Pedido pedido1 = new Pedido(1, new Date(), "cartão de visita", 100);
		Pedido pedido2 = new Pedido(2, new Date(), "folder", 200);
		Pedido pedido3 = new Pedido(3, new Date(), "flyer", 300);

		gerente.gerenciarPedido(pedido1);
		gerente.gerenciarPedido(pedido3);

		gerente.definirPrecoImpressao(1);

		double precoFinal = gerente.calcularPrecoFinal(pedido1);
		System.out.printf("O preço final do pedido %d é: R$ %.2f%n", pedido1.getId(), precoFinal);

		gerente.adicionarFuncionario(empregado);

		gerente.incluirPedido(pedido2);

		List<Pedido> pedidos = gerente.listarPedidos();
		for (Pedido pedido : pedidos) {
			System.out.println("ID: " + pedido.getId() + " - Produto: " + pedido.getTipoProduto() + " - Quantidade: "
					+ pedido.getQuantidade());
		}

		empregadoTerceirizado.realizarTarefa("impressão de cartão de visita");
	}
}
