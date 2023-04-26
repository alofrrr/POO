package Banco;

import java.util.ArrayList;

public class BancoA implements Banco {

	private ArrayList<Conta> contas = new ArrayList<>();

	public void manutencaoConta(Conta conta) {
		contas.add(conta);
	}

	public boolean saque(Conta conta, double valor) {
		if (!contas.contains(conta)) {
			System.out.println("Conta inexistente no banco.");
			return false;
		}

		if (conta.getSaldo() < valor) {
			System.out.println("o saque de R$ " + valor + " não foi possivel pois o saldo é insuficiente. O saldo disponivel na conta é de: R$ " + conta.getSaldo() + ".");
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

		if (contaOrigem.getSaldo() < valor) {
			System.out.println("Saldo insuficiente na conta de origem.");
			return;
		} else {
			contaOrigem.sacar(valor);
			contaDestino.depositar(valor);
			System.out.println("Transferência de R$ " + valor + " realizada com sucesso.");
		}
	}

}
