package AlgoritmoKahn;

class Main {
    public static void main(String args[])
    {
		//não consegui fazer com o do slide, tava fora de ordem nos numeros ai eu nao sabia como colocar os vertices, testei com esses outros 2 grafos
    	IGrafo meuGrafo1 = new Grafo(10);
    	meuGrafo1.adicionarAresta(9, 8);
    	meuGrafo1.adicionarAresta(1, 6);
    	meuGrafo1.adicionarAresta(0, 2);
    	meuGrafo1.adicionarAresta(5, 4);
    	meuGrafo1.adicionarAresta(3, 8);
    	meuGrafo1.adicionarAresta(2, 4);
    	meuGrafo1.adicionarAresta(5, 2);
    	meuGrafo1.adicionarAresta(9, 4);
    	meuGrafo1.adicionarAresta(7, 2);
    	meuGrafo1.adicionarAresta(2, 8);
    	meuGrafo1.executarAlgoritmoKahn();
    	
		System.out.println();

    	IGrafo meuGrafo2 = new Grafo(6);
    	meuGrafo2.adicionarAresta(5, 2);
    	meuGrafo2.adicionarAresta(5, 0);
    	meuGrafo2.adicionarAresta(4, 0);
    	meuGrafo2.adicionarAresta(4, 1);
    	meuGrafo2.adicionarAresta(2, 3);
    	meuGrafo2.adicionarAresta(3, 1);
    	meuGrafo2.executarAlgoritmoKahn();

    }
}










