package Main;

import View.CategoriaView;
import View.LivroCategoriaView;
import View.LivroView;

public class Main {
    public static void main(String[] args) {
        LivroView livroView = new LivroView();
        livroView.setVisible(true);
        
        CategoriaView categoriaView = new CategoriaView();
        categoriaView.setVisible(true);
        
        LivroCategoriaView livroCategoriaView = new LivroCategoriaView();
        livroCategoriaView.setVisible(true);
    }
}
