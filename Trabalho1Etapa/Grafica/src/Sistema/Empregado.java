package Sistema;

public class Empregado extends Usuario {
    private String setor;

    public Empregado(int id, String nome, String email, String senha, String tipo, String setor) {
        super(id, nome, email, senha, tipo);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
