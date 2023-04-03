package Lanchonete;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Cardapio cardapio = new Cardapio();

		boolean continuarPrograma = true;

		while (continuarPrograma) {

			System.out.println("Bem Vindo a Lanchonete Quase Três Lanches:");
			System.out.println("1 - Ver menu de pedidos realizados no dia");
			System.out.println("2 - Fazer Pedido");
			System.out.println("3 - Encerrar programa");
			System.out.print("Opção escolhida: ");
			int escolhaUsuario = scanner.nextInt();
			scanner.nextLine();

			switch (escolhaUsuario) {
			case 1:
				cardapio.imprimir();
				break;
			case 2:

				ArrayList<Produto> itensDoPedido = new ArrayList<>();

				// Cria um pedido para o cliente
				System.out.print("Digite o nome do cliente: ");
				String nomeDoCliente = scanner.nextLine();

				Pedido pedido = new Pedido(new Date(), nomeDoCliente, 5);

				// Loop para adicionar itens ao pedido
				boolean continuarPedindo = true;
				while (continuarPedindo) {
					System.out.println("Selecione o tipo de produto:");
					System.out.println("1 - Pizza");
					System.out.println("2 - Lanche");
					System.out.println("3 - Salgadinho");
					System.out.print("Opção escolhida: ");
					int tipoDeProduto = scanner.nextInt();
					scanner.nextLine();

					Produto produto = null;
					switch (tipoDeProduto) {

					case 1:
						
						System.out.print("Que nome você dá a esta pizza? (Ela ficará visivel no menu da noite) ");
						String nomeDoProduto = scanner.nextLine();
						Pizza pizza = new Pizza(nomeDoProduto, 22, new Date(), 1.0);
						System.out.print("Digite o recheio desejado (ou 'sair' para encerrar): ");
						String nomeDoRecheio = scanner.nextLine();
						while (!nomeDoRecheio.equalsIgnoreCase("sair")) {
							pizza.adicionarRecheio(nomeDoRecheio);
							System.out.print("Digite o recheio desejado (ou 'sair' para encerrar): ");
							nomeDoRecheio = scanner.nextLine();
						}
						System.out.print("Digite a borda desejada (ou 'sem borda' para encerrar): ");
						String nomeDaBorda = scanner.nextLine();
						while (!nomeDaBorda.equalsIgnoreCase("sair") && !nomeDaBorda.equalsIgnoreCase("sem borda")) {
							pizza.adicionarBorda(nomeDaBorda);
							System.out.print("Digite a borda desejada (ou 'sair' para encerrar): ");
							nomeDaBorda = scanner.nextLine();
						}
						System.out.print("Digite o molho desejado (ou 'sair' para encerrar): ");
						String nomeDoMolho = scanner.nextLine();
						while (!nomeDoMolho.equalsIgnoreCase("sair")) {
							pizza.adicionarMolho(nomeDoMolho);
							System.out.print("Digite o molho desejado (ou 'sair' para encerrar): ");
							nomeDoMolho = scanner.nextLine();
						}
						produto = pizza;
						cardapio.adicionarItem(pizza);
						break;

					case 2:
						System.out.print("Digite o nome do produto: ");
						String nomeDoProduto1 = scanner.nextLine();
						System.out.print("Digite o tipo de pão desejado: ");
						String tipoDePao = scanner.nextLine();
						Lanche lanche = new Lanche(nomeDoProduto1, 15, new Date(), 0.5, tipoDePao);
						System.out.print("Digite o recheio desejado: ");
						nomeDoRecheio = scanner.nextLine();
						System.out.print("Digite o molho desejado (ou 'sair' para encerrar): ");
						String nomeDoMolho1 = scanner.nextLine();
						while (!nomeDoMolho1.equalsIgnoreCase("sair")) {
							lanche.adicionarMolho(nomeDoMolho1);
							System.out.print("Digite o molho desejado (ou 'sair' para encerrar): ");
							nomeDoMolho1 = scanner.nextLine();
						}
						produto = lanche;
						cardapio.adicionarItem(lanche);
						break;
						
					case 3: 
						System.out.print("Digite o nome do produto: ");
						String nomeDoProduto2 = scanner.nextLine();
						System.out.print("Seu salgado sera frito ou assado? ");
						String tipoDoSalgado = scanner.nextLine();
						System.out.print("Massa de sua preferencia? ");
						String massa = scanner.nextLine();
						Salgadinho salgadinho = new Salgadinho(nomeDoProduto2, 5, new Date(), 0.5, tipoDoSalgado, massa);
						System.out.print("Digite o recheio desejado: ");
						nomeDoRecheio = scanner.nextLine();
						salgadinho.adicionarRecheio(nomeDoRecheio);
						produto = salgadinho;
						cardapio.adicionarItem(salgadinho);
						break;
						

					default:
						System.out.println("Opção inválida.");
						break;
					}

					if (produto != null) {
						System.out.print("Digite a quantidade: ");
						int quantidade = scanner.nextInt();
						scanner.nextLine();
						for (int i = 0; i < quantidade; i++) {
							pedido.adicionarProduto(produto);
							itensDoPedido.add(produto);
						}
					}

					System.out.print("Deseja adicionar mais itens? (s/n) ");
					String resposta = scanner.nextLine();
					if (resposta.equalsIgnoreCase("n")) {
						continuarPedindo = false;
					}
				}

				pedido.gerarNotaFiscal();
				System.out.print("Troco para? ");
				double troco = scanner.nextDouble();
				System.out.println("Troco: R$ " + pedido.calcularTroco(troco));

				break;

			case 3:
				continuarPrograma = false;
				break;
			}

		}

		scanner.close();
	}
}