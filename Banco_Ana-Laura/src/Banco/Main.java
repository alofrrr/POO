package Banco;

public class Main {

	public static void main(String[] args) {
		// Banco A
		Conta conta1 = new Conta("Ana", 1000, 1);
		Conta conta2 = new Conta("Felipe", 500, 2);
		System.out.println("Banco A");
		BancoA bancoA = new BancoA();

		bancoA.manutencaoConta(conta1);
		bancoA.manutencaoConta(conta2);

		bancoA.extrato(conta1);
		bancoA.extrato(conta2);

		bancoA.deposito(conta1, 500);
		bancoA.saque(conta2, 100);

		bancoA.extrato(conta1);
		bancoA.extrato(conta2);

		bancoA.transferencia(conta1, conta2, 200);
		bancoA.transferencia(conta2, conta1, 300);

		bancoA.extrato(conta1);
		bancoA.extrato(conta2);

		// Banco B
		Conta conta3 = new Conta("José", 1000, 3);
		Conta conta4 = new Conta("Claudia", 500, 4);
		BancoB bancoB = new BancoB();
		System.out.println("Banco B");

		bancoB.manutencaoConta(conta3);
		bancoB.manutencaoConta(conta4);

		bancoB.extrato(conta4);

		bancoB.saque(conta4, 1000);
		bancoB.extrato(conta4);
		bancoB.deposito(conta4, 100);

		bancoB.extrato(conta3);
		bancoB.extrato(conta4);

		bancoB.transferencia(conta4, conta3, 100);
		bancoB.transferencia(conta4, conta3, 100);

		bancoB.extrato(conta3);
		bancoB.extrato(conta4);

	}

}
