package Sistema;

public class EmpregadoTerceirizado extends Usuario {
    private String funcao;

    public EmpregadoTerceirizado(int id, String nome, String email, String senha, String funcao) {
        super(id, nome, email, senha, "empregado terceirizado");
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void realizarTarefa(String descricaoTarefa) {
        System.out.println("O empregado terceirizado " + getNome() + " está realizando a tarefa: " + descricaoTarefa);
    }
}
