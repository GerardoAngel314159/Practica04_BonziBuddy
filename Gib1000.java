/**
 * Implementacion de la interfaz Almacenamiento de 1000 gib
 */
public class Gib1000 implements Almacenamiento {

    /**
     * Almacena el tipo de Almacenamiento
     */
    private String tipo = "";

    /**
     * Establece la capacidad de Almacenamiento de 1000 Gib
     */
    @Override
    public void crearAlmacenamiento() {
        tipo = "1000 gib";
    }

    /**
     * Imprime la capacidad de Almacenamiento
     */
    @Override
    public void getTipo() {
        System.out.println(tipo);
    }
}