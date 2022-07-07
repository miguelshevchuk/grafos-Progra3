package BFS;

import algoritmos.Dijkstra;
import ejercicios.EjerciciosTest;
import org.junit.Test;

public class DijkstraTest extends EjerciciosTest {

    private Dijkstra dijkstra = new Dijkstra();
    @Test
    public void dibujarGrafoNoDirigido1(){

        this.dijkstra.ejecutar(this.grafoNoDirigido, 1);

    }

    @Test
    public void dibujarGrafoNoDirigido2(){
        this.dijkstra.ejecutar(this.grafoNoDirigido2, 2);
    }

}
