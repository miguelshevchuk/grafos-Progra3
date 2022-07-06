package algoritmos;

import ejercicios.AlgoritmoGrafos;
import grafo.Arco;
import grafo.GrafoNoDirigido;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS extends AlgoritmoGrafos {

    private GrafoNoDirigido<Integer> grafo;
    private int cantNodos;
    private int cantAristas;

    private int nodoInicial;
    private ArrayList<Arco> arbol;
    private boolean[] nodoTerminado;

    public GrafoNoDirigido getGrafo() {
        return grafo;
    }

    public int getCantNodos() {
        return cantNodos;
    }

    public int getCantAristas() {
        return cantAristas;
    }

    public int getNodoInicial() {
        return nodoInicial;
    }

    public BFS(GrafoNoDirigido grafo, int nodoInicial) {
        this.grafo = grafo;
        this.cantNodos = grafo.cantidadVertices();
        this.cantAristas = grafo.cantidadArcos();

        this.nodoInicial = nodoInicial;
        this.arbol = new ArrayList<Arco>();
        this.nodoTerminado = new boolean[this.cantNodos];
    }

    public void ejecutar(){

        Queue<Integer> cola = new LinkedList<Integer>();
        // acolo el nodo inicial
        cola.offer(this.nodoInicial);

        int nodo, indice;

        // mientras la cola no está vacía
        while(!cola.isEmpty()) {
            // pispeo el primer nodo de la cola
            nodo = cola.peek();

            // genero todos los números de nodo
            for (int i = 0; i < this.cantNodos; i++) {
                // si el nodo generado no es el nodo actual y no fue terminado
                if (nodo != i && !this.nodoTerminado[i]) {
                    // genero el índice para la matriz simétrica
                    if (nodo < i) {
                        indice = this.grafo.getGrafo().getIndice(nodo, i);
                    } else {
                        indice = this.grafo.getGrafo().getIndice(i, nodo);
                    }

                    // si existe una arista que una estos nodos
                    if (this.grafo.getGrafo().hayArista(indice)) {
                        // agrego la arista al árbol
                        this.arbol.add(new Arista(nodo, i));
                        // acolo el otro nodo de la arista para seguir recorriendo a partir de él
                        cola.offer(i);
                        // marco como terminado al nodo acolado
                        this.nodoTerminado[i] = true;
                    }
                }
            }

            // desacolo el primer nodo de la cola y lo marco como terminado
            nodo = cola.poll();
            this.nodoTerminado[nodo] = true;
        }

        // escribo la solucion en consola
        this.escribirSolucionEnConsola();

        // escribo la solucion completa en un archivo
        this.escribirSolucionEnArchivo("BFS" + "_" + this.cantNodos + "_"
                + String.format("%.2f", this.getGrafo().getPtajeAdyacencia()) + ".out");
    }

}
