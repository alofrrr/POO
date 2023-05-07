package Controller;

import java.util.ArrayList;

import Model.LivroCategoria;

public class LivroCategoriaController {
    private ArrayList<LivroCategoria> livroCategoria;

    public LivroCategoriaController() {
        livroCategoria = new ArrayList<LivroCategoria>();
    }
    
    public void cadastrarLivroCategoria(String idLivro, String idCategoria) {
        LivroCategoria livCat = new LivroCategoria(idLivro, idCategoria);
        livroCategoria.add(livCat);
    }
    
    public ArrayList<LivroCategoria> getLivroCategoria() {
        return livroCategoria;
    }

   
}

