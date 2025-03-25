/**
 * Implementacion de la interfaz Camara que representa una camara con dos lentes.
 */
public class CamaraDos implements Camara {

    /**
     * Almacena el tipo de camara.
     */
    private String tipo = "";

    /**
     * Establece el tipo de camara como "Dos camaras".
     */
    @Override
    public void crearCamara() {
        tipo = "Dos camaras";
    }

    /**
     * Imprime el tipo de camara en la consola.
     */
    @Override
    public void getTipo() {
        System.out.println(tipo);
    }
}