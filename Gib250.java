/**
 * Implementacion de la interfaz Almacenamiento de 250 gib
 */
public class Gib250 implements Almacenamiento {

    /**
     * Almacena el tipo de Almacenamiento
     */
    private String tipo = "";

    /**
     * Establece la capacidad de Almacenamiento de 250 Gib
     */
    @Override
    public void crearAlmacenamiento() {
        tipo = "250 gib";
    }

    /**
     * Imprime la capacidad de Almacenamiento
     */
    @Override
    public void getTipo() {
        System.out.println(tipo);
    }
}