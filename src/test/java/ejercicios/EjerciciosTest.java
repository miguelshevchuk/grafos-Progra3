package ejercicios;

import grafo.GrafoNoDirigido;

public abstract class EjerciciosTest {

    protected GrafoNoDirigido grafoNoDirigido;
    protected GrafoNoDirigido grafoNoDirigido2;

    public EjerciciosTest(){

        this.grafoNoDirigido = new GrafoNoDirigido();

        this.grafoNoDirigido.agregarVertice(1);
        this.grafoNoDirigido.agregarVertice(2);
        this.grafoNoDirigido.agregarVertice(3);
        this.grafoNoDirigido.agregarVertice(4);
        this.grafoNoDirigido.agregarVertice(5);

        this.grafoNoDirigido.agregarArco(1, 2, 5);
        this.grafoNoDirigido.agregarArco(1, 5, 6);
        this.grafoNoDirigido.agregarArco(2, 3, 2);
        this.grafoNoDirigido.agregarArco(2, 5, 2);
        this.grafoNoDirigido.agregarArco(3, 4, 3);



        this.grafoNoDirigido2 = new GrafoNoDirigido();

        this.grafoNoDirigido2.agregarVertice(1);
        this.grafoNoDirigido2.agregarVertice(2);
        this.grafoNoDirigido2.agregarVertice(3);
        this.grafoNoDirigido2.agregarVertice(4);
        this.grafoNoDirigido2.agregarVertice(5);
        this.grafoNoDirigido2.agregarVertice(6);
        this.grafoNoDirigido2.agregarVertice(7);
        this.grafoNoDirigido2.agregarVertice(8);

        this.grafoNoDirigido2.agregarArco(5, 1, 5);
        this.grafoNoDirigido2.agregarArco(1, 2, 5);
        this.grafoNoDirigido2.agregarArco(2, 6, 5);
        this.grafoNoDirigido2.agregarArco(6, 3, 5);
        this.grafoNoDirigido2.agregarArco(6, 7, 5);
        this.grafoNoDirigido2.agregarArco(3, 7, 5);
        this.grafoNoDirigido2.agregarArco(3, 4, 5);
        this.grafoNoDirigido2.agregarArco(7, 4, 5);
        this.grafoNoDirigido2.agregarArco(7, 8, 5);
        this.grafoNoDirigido2.agregarArco(4, 8, 5);

    }

}
