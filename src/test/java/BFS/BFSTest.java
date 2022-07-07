package BFS;

import algoritmos.BFS;
import ejercicios.EjerciciosTest;
import org.junit.Test;

public class BFSTest extends EjerciciosTest {

    private BFS bfs = new BFS();
    @Test
    public void dibujarGrafoNoDirigido1(){

        this.bfs.ejecutar(this.grafoNoDirigido, 1);

    }

    @Test
    public void dibujarGrafoNoDirigido2(){
        this.bfs.ejecutar(this.grafoNoDirigido2, 2);
    }

}
