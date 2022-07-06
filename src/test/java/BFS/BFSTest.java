package BFS;

import algoritmos.BFS;
import ejercicios.EjerciciosTest;
import org.junit.Test;

public class BFSTest extends EjerciciosTest {

    private BFS bfs = new BFS(this.grafoNoDirigido, 1);
    private BFS bfs2 = new BFS(this.grafoNoDirigido2, 2);

    @Test
    public void probar(){
        this.bfs.ejecutar();
    }

    @Test
    public void probar2(){
        this.bfs2.ejecutar();
    }

}
