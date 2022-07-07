package algoritmos;

import ejercicios.AlgoritmoGrafos;
import grafo.Arco;
import grafo.GrafoNoDirigido;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

public class Dijkstra extends AlgoritmoGrafos {

    public void ejecutar(GrafoNoDirigido<Integer> grafo, Integer nodoInicial) {

        Queue<Integer> cola = new LinkedList<>();
        cola.offer(nodoInicial);

        Map<Integer, NodoDistancia> camino = new HashMap<>();

        Integer distanciaRecorrida = 0;

        camino.put(nodoInicial, new NodoDistancia(null, distanciaRecorrida, "PERMANENTE"));

        while (!cola.isEmpty()) {

            Integer verticePadre = cola.peek();

            List<Integer> adyacentes = grafo.obtenerAdyacentes(verticePadre);

            Integer distanciaMinima = 0;
            Arco<Integer> arcoMasCorto = null;

            for (Integer adyacente : adyacentes) {
                if (camino.get(adyacente) == null || !"PERMANENTE".equals(camino.get(adyacente).getEstado())) {
                    Arco<Integer> arco = grafo.obtenerArco(verticePadre, adyacente);

                    camino.put(adyacente, new NodoDistancia(verticePadre,
                            distanciaRecorrida+arco.getEtiqueta(), "PROVISORIO"));

                    if(distanciaMinima > arco.getEtiqueta() || distanciaMinima == 0){
                        arcoMasCorto = arco;
                        distanciaMinima = arco.getEtiqueta();
                    }

                }
            }

            if(Objects.nonNull(arcoMasCorto)){
                cola.offer(arcoMasCorto.getVerticeDestino());
                distanciaRecorrida = arcoMasCorto.getEtiqueta() + distanciaRecorrida;

                NodoDistancia nodoMasCorto = camino.get(arcoMasCorto.getVerticeDestino());
                nodoMasCorto.pasarAPermanente();
                camino.put(arcoMasCorto.getVerticeDestino(), nodoMasCorto);
            }


            cola.poll();
        }

        printer.println(camino);
    }

    @Data
    @AllArgsConstructor
    public class NodoDistancia{
        private Integer verticePadre;
        private Integer distanciaTotal;
        private String estado;

        public void pasarAPermanente(){
            this.estado = "PERMANENTE";
        }

    }


}
