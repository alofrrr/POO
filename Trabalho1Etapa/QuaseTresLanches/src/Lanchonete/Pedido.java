package Lanchonete;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private Date data;
    private String cliente;
    private double taxaServico;
    private ArrayList<Produto> produtos;

    public Pedido(Date data, String cliente, double taxaServico) {
        this.data = data;
        this.cliente = cliente;
        this.taxaServico = taxaServico;
        produtos = new ArrayList<Produto>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;
        for (Produto produto : produtos) {
            valorTotal += produto.getPreco();
        }
        valorTotal += taxaServico;
        return valorTotal;
    }

    public void gerarNotaFiscal() {
        System.out.println("========== Nota Fiscal ==========");
        System.out.println("Data: " + data);
        System.out.println("Cliente: " + cliente);
        System.out.println("Produtos:");
        for (Produto produto : produtos) {
            System.out.println("- " + produto.getNome() + ": R$ " + produto.getPreco());
        }
        System.out.println("Taxa de serviço: R$ " + taxaServico);
        System.out.println("Total: R$ " + calcularValorTotal());
        System.out.println("=================================");
    }

    public double calcularTroco(double valorRecebido) {
        double troco = valorRecebido - calcularValorTotal();
        return troco;
    }
}
