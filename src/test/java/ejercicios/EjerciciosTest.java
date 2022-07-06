package ejercicios;

public abstract class EjerciciosTest {

    protected String[] arrayAlfabeticoOrdenado;
    protected String[] arrayAlfabeticoDesordenado;
    protected Integer[] arrayNumericoOrdenado;

    public EjerciciosTest(){
        this.arrayAlfabeticoDesordenado = new String[]{"a", "f", "a","b", "z"};
        this.arrayAlfabeticoOrdenado = new String[]{"a", "b", "r", "z"};
        this.arrayNumericoOrdenado = new Integer[]{-8, -2, 1, 3, 5, 9, 20};
    }

}
