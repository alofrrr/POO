package Banco;

public interface Banco {
	public void manutencaoConta(Conta Conta);
	public boolean saque(Conta conta, double valor);
	public boolean deposito(Conta conta, double valor);
	public void extrato(Conta conta);
}