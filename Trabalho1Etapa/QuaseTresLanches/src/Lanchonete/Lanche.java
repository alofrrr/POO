package Lanchonete;

import java.util.ArrayList;

public class Lanche extends Produto {
    private String tipoPao;
    private ArrayList<String> recheios;
    private ArrayList<String> molhos;

    public Lanche(String nome, double preco, java.util.Date dataValidade, double peso, String tipoPao) {
        super(nome, preco, dataValidade, peso, TipoProduto.LANCHE);
        this.tipoPao = tipoPao;
        recheios = new ArrayList<String>();
        molhos = new ArrayList<String>();
    }

    public void adicionarRecheio(String recheio) {
        recheios.add(recheio);
    }

    public void adicionarMolho(String molho) {
        molhos.add(molho);
    }

    public String getTipoPao() {
        return tipoPao;
    }

    public ArrayList<String> getRecheios() {
        return recheios;
    }

    public ArrayList<String> getMolhos() {
        return molhos;
    }

    @Override
    public String toString() {
        return "Lanche " + super.getNome() + "\nTipo Pao: " + tipoPao + ", Recheios:" + recheios + ", Molhos: " + molhos + ", Preço: " + super.getPreco() + "\n";
    }
}
