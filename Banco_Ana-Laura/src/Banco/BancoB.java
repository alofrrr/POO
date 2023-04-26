package Banco;

import java.util.ArrayList;

public class BancoB implements Banco {

	private ArrayList<Conta> contas = new ArrayList<>();

	public void manutencaoConta(Conta conta) {
		contas.add(conta);
	}

	public boolean saque(Conta conta, double valor) {
		if (!contas.contains(conta)) {
			System.out.println("Conta inexistente no banco.");
			return false;
		}

		double saldoAtual = conta.getSaldo();
		double limiteNegativo = 500.0;
		double limiteSaque = saldoAtual + limiteNegativo;

		if (valor <= 0) {
			System.out.println("O valor do saque deve ser maior que zero.");
			return false;
		} else if (valor > limiteSaque) {
			System.out.println("O saque de R$ " + valor
					+ " não é permitido, pois ultrapassa o limite disponível para saque. O saldo disponível na conta é de: R$ "
					+ saldoAtual + ". E o limite máximo negativo que a conta pode atingir é de R$-500.");
			return false;
		} else {
			conta.sacar(valor);
			System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
			return true;
		}
	}

	public boolean deposito(Conta conta, double valor) {
		if (!contas.contains(conta)) {
			System.out.println("Conta inexistente no banco.");
			return false;
		}

		double saldoAtual = conta.getSaldo();

		if (saldoAtual < 0) {
			double quitado = 500 + (saldoAtual + valor);
			System.out.println("Foi utilizado R$ " + quitado + " do valor depositado para quitar a dívida pendente.");
		}

		conta.depositar(valor);
		System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
		return true;
	}

	public void extrato(Conta conta) {
		if (!contas.contains(conta)) {
			System.out.println("Conta inexistente no banco.");
			return;
		}

		System.out.println("Extrato da conta " + conta.getNumeroConta() + ":");
		System.out.println("Titular: " + conta.getTitular());
		System.out.println("Saldo: " + conta.getSaldo());
	}

	public void transferencia(Conta contaOrigem, Conta contaDestino, double valor) {
		if (!contas.contains(contaOrigem)) {
			System.out.println("Conta de origem inexistente no banco.");
			return;
		}

		if (!contas.contains(contaDestino)) {
			System.out.println("Conta de destino inexistente no banco.");
			return;
		}

		double saldoOrigem = contaOrigem.getSaldo();
		double limiteNegativo = -500.0;
		
		if (saldoOrigem < 0 && saldoOrigem <= limiteNegativo) {
			System.out.println("Limite negativo atingido.");
			return;
		}

		if (saldoOrigem - valor < limiteNegativo) {
			System.out.println("Saldo insuficiente na conta de origem.");
			return;
		}

		contaOrigem.sacar(valor);
		contaDestino.depositar(valor);
		System.out.println("Transferência de R$ " + valor + " realizada com sucesso.");
	}

}
