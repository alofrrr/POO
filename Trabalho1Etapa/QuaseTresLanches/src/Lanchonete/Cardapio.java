package Lanchonete;

import java.util.ArrayList;
import java.util.Date;

public class Cardapio {
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private Date data = new Date();
    

    public void adicionarItem(Produto item) {
        produtos.add(item);
    }

    public void imprimir() {
    	
    	if(produtos.isEmpty()) {
        	System.out.println("Sem pedidos realizados " + data + "!\n\n");

    	}else {
    		    for (Produto produto : produtos) {
    	    	System.out.println("Pedidos realizados no dia " + data + "!");
    	        System.out.println("---------------");
    	        if (produto instanceof Pizza) {
    	            Pizza pizza = (Pizza) produto;
    	            System.out.println(pizza.toString());
    	        } else if (produto instanceof Lanche) {
    	            Lanche lanche = (Lanche) produto;
    	            System.out.println(lanche.toString());
    	        } else if (produto instanceof Salgadinho) {
    	            Salgadinho salgadinho = (Salgadinho) produto;
    	            System.out.println(salgadinho.toString());
    	        }
    	    }
    	}
    	 
    	
}

}
