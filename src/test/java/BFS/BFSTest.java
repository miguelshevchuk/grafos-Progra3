package BFS;

import algoritmos.BFS;
import ejercicios.EjerciciosTest;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class BFSTest extends EjerciciosTest {

    private BFS bfs = new BFS();
    @Test
    public void dibujarGrafoNoDirigido1(){
        Map<Integer, Integer> expected = new HashMap<>();
        expected.put(1, 2);
        expected.put(3, 6);
        expected.put(4, 3);
        expected.put(5, 1);
        expected.put(6, 2);
        expected.put(7, 6);
        expected.put(8, 7);

        this.bfs.ejecutar(this.grafoNoDirigido, 1);

    }

    @Test
    public void dibujarGrafoNoDirigido2(){
        this.bfs.ejecutar(this.grafoNoDirigido2, 2);
    }

}
