package algoritmos;

import ejercicios.AlgoritmoGrafos;
import grafo.Arista;
import grafo.GrafoNoDirigido;

import java.util.*;

public class Dijkstra extends AlgoritmoGrafos {

    public void ejecutar(GrafoNoDirigido<Integer> grafo, Integer nodoInicial) {

        Queue<Integer> cola = new LinkedList<>();
        //Encolo el nodo inicial
        cola.offer(nodoInicial);

        Map<Integer, String> estadoVertices = new HashMap<>();
        List<Arista> arbol = new ArrayList<>();
        arbol.add(new Arista(null, nodoInicial));

        // mientras la cola no está vacía
        while (!cola.isEmpty()) {
            //Desencolo el primer nodo de la lista
            Integer verticePadre = cola.peek();

            List<Integer> adyacentes = grafo.obtenerAdyacentes(verticePadre);

            for (Integer adyacente : adyacentes) {
                if (estadoVertices.get(adyacente) == null || "BLANCO".equals(estadoVertices.get(adyacente))) {
                    estadoVertices.put(adyacente, "GRIS");
                    arbol.add(new Arista(verticePadre, adyacente));
                    cola.offer(adyacente);
                }
            }

            cola.poll();
            estadoVertices.put(verticePadre, "NEGRO");
        }

        printer.println(arbol);
    }

}
