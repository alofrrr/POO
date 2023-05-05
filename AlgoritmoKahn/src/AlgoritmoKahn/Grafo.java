package AlgoritmoKahn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Grafo implements IGrafo {

	private int numVertices;
	private List<Integer>[] listaAdjacencia;

	@SuppressWarnings("unchecked")
	public Grafo(int numVertices) {
		this.numVertices = numVertices;
		listaAdjacencia = new ArrayList[numVertices];
		for (int i = 0; i < numVertices; i++) {
			listaAdjacencia[i] = new ArrayList<>();
		}
	}

	public void adicionarAresta(int u, int v) {
		listaAdjacencia[u].add(v);
	}

	public void executarAlgoritmoKahn() {
		Queue<Integer> fila = new LinkedList<>();
		List<Integer> ordemTopologica = new ArrayList<>();
		int[] grauEntrada = new int[numVertices];
		int cont = 0;

		for (int i = 0; i < numVertices; i++) {
			List<Integer> vizinhos = listaAdjacencia[i];
			for (int vizinho : vizinhos) {
				grauEntrada[vizinho]++;
			}
		}

		for (int i = 0; i < numVertices; i++) {
			if (grauEntrada[i] == 0) {
				fila.offer(i);
			}
		}

		while (!fila.isEmpty()) {
			int atual = fila.poll();
			ordemTopologica.add(atual);
			cont++;
			for (int vizinho : listaAdjacencia[atual]) {
				if (--grauEntrada[vizinho] == 0) {
					fila.offer(vizinho);
				}
			}
		}

		if (cont == numVertices) {
			System.out.print("Ordem topológica: ");
			for (int vertice : ordemTopologica) {
				System.out.print(vertice + " ");
			}
		} else {
			System.out.println("Erro ao encontrar ordem topológica");
		}

	}
}