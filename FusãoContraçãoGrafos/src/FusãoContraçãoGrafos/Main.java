package FusãoContraçãoGrafos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		List<Vertice> listaVertices = new ArrayList<Vertice>();
		List<Integer> aux = new ArrayList<Integer>();

		aux.add(2);
		aux.add(3);
		aux.add(6);
		aux.add(7);
		listaVertices.add(new Vertice(1, aux));

		aux = new ArrayList<Integer>();
		aux.add(1);
		aux.add(3);
		aux.add(4);
		aux.add(5);
		listaVertices.add(new Vertice(2, aux));

		aux = new ArrayList<Integer>();
		aux.add(1);
		aux.add(2);
		aux.add(4);
		aux.add(5);
		aux.add(6);
		aux.add(7);
		listaVertices.add(new Vertice(3, aux));

		aux = new ArrayList<Integer>();
		aux.add(2);
		aux.add(3);
		aux.add(9);
		aux.add(10);
		listaVertices.add(new Vertice(4, aux));

		aux = new ArrayList<Integer>();
		aux.add(2);
		aux.add(3);
		aux.add(7);
		aux.add(8);
		aux.add(10);
		listaVertices.add(new Vertice(5, aux));

		aux = new ArrayList<Integer>();
		aux.add(1);
		aux.add(3);
		aux.add(7);
		listaVertices.add(new Vertice(6, aux));

		aux = new ArrayList<Integer>();
		aux.add(1);
		aux.add(3);
		aux.add(5);
		aux.add(6);
		aux.add(8);
		listaVertices.add(new Vertice(7, aux));

		aux = new ArrayList<Integer>();
		aux.add(5);
		aux.add(7);
		aux.add(10);
		listaVertices.add(new Vertice(8, aux));

		aux = new ArrayList<Integer>();
		aux.add(4);
		aux.add(10);
		listaVertices.add(new Vertice(9, aux));

		aux = new ArrayList<Integer>();
		aux.add(4);
		aux.add(5);
		aux.add(8);
		aux.add(9);
		listaVertices.add(new Vertice(10, aux));

		existeCaminho(6, 9, listaVertices);
		realizarFusao(2, 5, listaVertices);
		realizarContracaoVertice(1, 3, listaVertices);
		realizarContracaoAresta(4, 10, listaVertices);

	}

	public static void realizarFusao(Integer v1, Integer v2, List<Vertice> listaVertices) {
		System.out.print("Pré Fusão: ");
		imprimirAdjacentes(listaVertices);
		fusaoVertices(v1, v2, listaVertices);
		System.out.println();
		System.out.print("Pós Fusão: ");
		imprimirAdjacentes(listaVertices);
		System.out.println();

	}

	public static void realizarContracaoVertice(Integer v1, Integer v2, List<Vertice> listaVertices) {
		System.out.print("Pré Contração de Vertices: ");
		imprimirAdjacentes(listaVertices);
		contracaoVertices(v1, v2, listaVertices);
		System.out.println();
		System.out.print("Pós Contração de Vertices: ");
		imprimirAdjacentes(listaVertices);
		System.out.println();

	}

	public static void realizarContracaoAresta(Integer v1, Integer v2, List<Vertice> listaVertices) {
		System.out.print("Pré Contração de Arestas: ");
		imprimirAdjacentes(listaVertices);
		contracaoAresta(v1, v2, listaVertices);
		System.out.println();
		System.out.print("Pós Contração de Arestas: ");
		imprimirAdjacentes(listaVertices);
		System.out.println();
	}

	public static void existeCaminho(Integer x, Integer y, List<Vertice> listaVertice) {
		System.out.print("Caminhos encontrados: ");
		System.out.println();
		boolean[] visitado = new boolean[listaVertice.size()];
		List<Integer> caminho = new ArrayList<Integer>();
		dfs(x, y, listaVertice, visitado, caminho);
		System.out.println();
	}

	public static void imprimirAdjacentes(List<Vertice> listaVertice) {
		System.out.println();
		System.out.println();
		for (Vertice v : listaVertice) {
			System.out.print("Lista de Adjacentes do Vértice " + v.getValor() + ": ");
			for (Integer i = 0; i < v.getAdjacentes().size(); i++) {
				System.out.print(v.getAdjacentes().get(i).intValue() + " - ");
			}
			System.out.println();
		}
	}

	public static void fusaoVertices(Integer v1, Integer v2, List<Vertice> listaVertice) {
		if (v1 != v2) {
			boolean encontrouV1 = false;
			boolean encontrouV2 = false;
			Vertice ver1 = new Vertice();
			Vertice ver2 = new Vertice();
			for (Vertice v : listaVertice) {
				if (v1 == v.getValor()) {
					encontrouV1 = true;
					ver1 = v;
				} else if (v2 == v.getValor()) {
					encontrouV2 = true;
					ver2 = v;
				}
				if (encontrouV1 && encontrouV2) {
					break;
				}
			}

			Vertice novo = new Vertice();
			String nome = ver1.getValor().toString() + ver2.getValor().toString();
			novo.setValor(Integer.parseInt(nome));

			Set<Integer> conjuntoAux = new HashSet<>(ver1.getAdjacentes());
			conjuntoAux.addAll(ver2.getAdjacentes());
			conjuntoAux.remove(ver1.getValor());
			conjuntoAux.remove(ver2.getValor());
			List<Integer> listaAux = new ArrayList<>(conjuntoAux);

			novo.setAdjacentes(listaAux);
			listaVertice.add(novo);
			listaVertice.remove(ver1);
			listaVertice.remove(ver2);
		}
	}

	public static void contracaoVertices(Integer v1, Integer v2, List<Vertice> listaVertice) {
		if (v1 != v2) {
			boolean encontrouV1 = false;
			boolean encontrouV2 = false;
			Vertice ver1 = new Vertice();
			Vertice ver2 = new Vertice();
			for (Vertice v : listaVertice) {
				if (v1 == v.getValor()) {
					encontrouV1 = true;
					ver1 = v;
				} else if (v2 == v.getValor()) {
					encontrouV2 = true;
					ver2 = v;
				}
				if (encontrouV1 && encontrouV2) {
					break;
				}
			}

			Set<Integer> setAdjacentes = new HashSet<>();
			for (Integer i = 0; i < ver1.getAdjacentes().size(); i++) {
				Integer adjacente = ver1.getAdjacentes().get(i);
				if (adjacente.equals(v2)) {
				} else if (!adjacente.equals(v1)) {
					setAdjacentes.add(adjacente);
				}
			}
			for (Integer i = 0; i < ver2.getAdjacentes().size(); i++) {
				Integer adjacente = ver2.getAdjacentes().get(i);
				if (!adjacente.equals(v1) && !adjacente.equals(v2) && !ver1.getAdjacentes().contains(adjacente)) {
					setAdjacentes.add(adjacente);
				}
			}

			List<Integer> listaAdjacentes = new ArrayList<>(setAdjacentes);
			ver2.setAdjacentes(listaAdjacentes);
			listaVertice.remove(ver1);
		}
	}

	public static void contracaoAresta(Integer v1, Integer v2, List<Vertice> listaVertice) {
		if (v1 != v2) {
			boolean encontrouV1 = false;
			boolean encontrouV2 = false;
			Vertice ver1 = new Vertice();
			Vertice ver2 = new Vertice();
			for (Vertice v : listaVertice) {
				if (v1 == v.getValor()) {
					encontrouV1 = true;
					ver1 = v;
				} else if (v2 == v.getValor()) {
					encontrouV2 = true;
					ver2 = v;
				}
				if (encontrouV1 && encontrouV2) {
					break;
				}
			}

			Set<Integer> valoresAdjacentes = new HashSet<>(ver1.getAdjacentes());
			boolean existeAresta = valoresAdjacentes.contains(v2);
			valoresAdjacentes.remove(v1);
			valoresAdjacentes.remove(v2);
			valoresAdjacentes.addAll(ver2.getAdjacentes());

			List<Integer> listaAux = new ArrayList<>(valoresAdjacentes);
			if (!existeAresta) {
				listaAux.add(v2);
			}

			ver2.setAdjacentes(listaAux);
			listaVertice.remove(ver1);
		}
	}

	private static void dfs(Integer atual, Integer destino, List<Vertice> listaVertice, boolean[] visitado,
			List<Integer> caminho) {
		visitado[atual] = true;
		caminho.add(atual);

		if (atual.equals(destino)) {
			System.out.print("-> ");
			for (Integer vertice : caminho) {
				System.out.print(vertice + " ");
			}
			System.out.println();
		} else {
			Vertice v = listaVertice.get(atual);
			if (v.getAdjacentes() != null && !v.getAdjacentes().isEmpty()) {
				for (Integer adjacente : v.getAdjacentes()) {
					if (adjacente < visitado.length && !visitado[adjacente]) {
						dfs(adjacente, destino, listaVertice, visitado, caminho);
					}
				}
			}
		}

		caminho.remove(caminho.size() - 1);
		visitado[atual] = false;
	}

}
