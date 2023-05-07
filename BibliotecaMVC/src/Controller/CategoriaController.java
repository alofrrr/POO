package Controller;

import java.util.ArrayList;

import Model.Categoria;

public class CategoriaController {
	
	private ArrayList<Categoria> categorias;

	public CategoriaController() {
		categorias = new ArrayList<Categoria>();
	}
	
	public void cadastrarCategoria(String idCategoria, String nome) {
		Categoria categoria = new Categoria(idCategoria, nome);
		categorias.add(categoria);
	}
	
	public ArrayList<Categoria> getCategorias() {
		return categorias;
	}
}
