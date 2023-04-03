package Sistema;

import java.util.Date;

public class Pedido {
    private int id;
    private Date data;
    private String tipoProduto;
    private int quantidade;
    private String status;

    public Pedido(int id, Date data, String tipoProduto, int quantidade) {
        this.id = id;
        this.data = data;
        this.tipoProduto = tipoProduto;
        this.quantidade = quantidade;
        this.status = "PENDENTE";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pedido) {
            Pedido pedido = (Pedido) obj;
            return this.id == pedido.id;
        }
        return false;
    }
}
