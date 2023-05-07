package Controller;

import java.util.ArrayList;
import java.util.Date;

import Model.Livro;

public class LivroController {
	
	private ArrayList<Livro> livros;

	public LivroController() {
		livros = new ArrayList<Livro>();
	}
	
	public void cadastrarLivro(String idLivro, String nome, String autor, Date anoPublicacao) {
		Livro livro = new Livro(idLivro, nome, autor, anoPublicacao);
		livros.add(livro);
	}
	
	public ArrayList<Livro> getLivros() {
		return livros;
	}

	

}
