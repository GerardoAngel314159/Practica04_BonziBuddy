/**
 * Implementacion de la interfaz Camara que representa una camara con cuatro lentes.
 */
public class CamaraCuatro implements Camara{

    /**
     * Almacena el tipo de camara.
     */
    private String tipo;

    /**
     * Establece el tipo de camara como "Cuatro camaras".
     */
    @Override
    public void crearCamara (){
        tipo = "Cuatro camaras";
    }

    /**
     * Imprime el tipo de camara en la consola.
     */
    @Override
    public void getTipo(){
        System.out.println(tipo);
    }
}