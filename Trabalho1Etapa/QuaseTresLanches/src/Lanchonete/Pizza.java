package Lanchonete;

import java.util.ArrayList;

public class Pizza extends Produto {
    private ArrayList<String> recheios;
    private ArrayList<String> bordas;
    private ArrayList<String> molhos;

    public Pizza(String nome, double preco, java.util.Date dataValidade, double peso) {
        super(nome, preco, dataValidade, peso, TipoProduto.PIZZA);
        recheios = new ArrayList<String>();
        bordas = new ArrayList<String>();
        molhos = new ArrayList<String>();
    }

    public void adicionarRecheio(String recheio) {
        recheios.add(recheio);
    }

    public void adicionarBorda(String borda) {
        bordas.add(borda);
    }

    public void adicionarMolho(String molho) {
        molhos.add(molho);
    }
    
    public ArrayList<String> getRecheios() {
        return recheios;
    }

    public ArrayList<String> getBordas() {
        return bordas;
    }

    public ArrayList<String> getMolhos() {
        return molhos;
    }

    @Override
    public String toString() {
        return "Pizza "  + super.getNome() + "\nRecheios: " + recheios + ", Bordas: " + bordas + ", Molhos: " + molhos + ", Preço:" + super.getPreco() + "\n";
    }
}
