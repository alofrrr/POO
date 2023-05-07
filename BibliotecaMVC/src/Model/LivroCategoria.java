package Model;

public class LivroCategoria {
	
	private String idLivro;
	private String idCategoria;
	
	public LivroCategoria(String idLivro, String idCategoria) {
		super();
		this.idLivro = idLivro;
		this.idCategoria = idCategoria;
	}

	public String getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(String idLivro) {
		this.idLivro = idLivro;
	}

	public String getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(String idCategoria) {
		this.idCategoria = idCategoria;
	}


}
