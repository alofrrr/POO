package Banco;

public class Conta {

	private String titular;
	private double saldo;
	private int numeroConta;

	public Conta(String titular, double saldoInicial, int numeroConta) {
		this.titular = titular;
		this.saldo = saldoInicial;
		this.numeroConta = numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public void sacar(double valor) {
		saldo -= valor;
	}

}
