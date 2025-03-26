/**
 * Implementacion de la interfaz Almacenamiento de 500 gib
 */
public class Gib500 implements Almacenamiento {

    /**
     * Almacena el tipo de Almacenamiento
     */
    private String tipo;

    /**
     * Establece la capacidad de Almacenamiento de 500 Gib
     */
    @Override
    public void crearAlmacenamiento() {
        tipo = "500 gib";
    }

    /**
     * Imprime la capacidad de Almacenamiento
     */
    @Override
    public void getTipo() {
        System.out.println(tipo);
    }
}