package Lanchonete;

import java.util.ArrayList;

public class Salgadinho extends Produto {
    private String tipoSalgadinho;
    private String massa;
    private ArrayList<String> recheios;

    public Salgadinho(String nome, double preco, java.util.Date dataValidade, double peso, String tipoSalgadinho, String massa) {
        super(nome, preco, dataValidade, peso, TipoProduto.SALGADINHO);
        this.tipoSalgadinho = tipoSalgadinho;
        this.massa = massa;
        recheios = new ArrayList<String>();
    }

    public void adicionarRecheio(String recheio) {
        recheios.add(recheio);
    }

    public String getTipoSalgadinho() {
        return tipoSalgadinho;
    }

    public String getMassa() {
        return massa;
    }

    public ArrayList<String> getRecheios() {
        return recheios;
    }

    @Override
    public String toString() {
        return "Salgadinho " + super.getNome() + "\nTipo:" + tipoSalgadinho + ", Massa:" + massa + ", Recheios=" + recheios + ", Preço:" + super.getPreco() + "\n";
    }
}
