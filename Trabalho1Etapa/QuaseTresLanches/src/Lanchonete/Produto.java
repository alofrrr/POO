package Lanchonete;

import java.util.Date;

public class Produto {
    private String nome;
    private double preco;
    private Date dataValidade;
    private double peso;
    private TipoProduto tipo;

    public Produto(String nome, double preco, Date dataValidade, double peso, TipoProduto tipo) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
        this.peso = peso;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public double getPeso() {
        return peso;
    }

    public TipoProduto getTipo() {
        return tipo;
    }
}
