package algoritmos;

import ejercicios.AlgoritmoGrafos;
import grafo.Arista;
import grafo.GrafoNoDirigido;

import java.util.*;

public class BFS extends AlgoritmoGrafos {

    private GrafoNoDirigido<Integer> grafo;
    private int cantNodos;
    private int cantAristas;

    private int nodoInicial;
    private ArrayList<Arista> arbol;
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
        //this.arbol = new ArrayList<Arco>();
        this.nodoTerminado = new boolean[this.cantNodos];
    }

    public void ejecutar() {

        Queue<Integer> cola = new LinkedList<Integer>();
        // acolo el nodo inicial
        cola.offer(this.nodoInicial);

        Map<Integer, String> estadoVertices = new HashMap<Integer, String>();
        Map<Integer, Integer> padres = new HashMap<Integer, Integer>();

        // mientras la cola no está vacía
        while (!cola.isEmpty()) {
            // pispeo el primer nodo de la cola
            Integer verticeActual = cola.peek();

            List<Integer> adyacentes = this.grafo.obtenerAdyacentes(verticeActual);

            for (Integer adyacente : adyacentes) {
                if (estadoVertices.get(adyacente) == null || "BLANCO".equals(estadoVertices.get(adyacente))) {
                    estadoVertices.put(adyacente, "GRIS");
                    padres.put(adyacente, verticeActual);
                    cola.offer(adyacente);
                }
            }

            cola.poll();
            estadoVertices.put(verticeActual, "NEGRO");
        }
        printer.println(padres);
    }

}
