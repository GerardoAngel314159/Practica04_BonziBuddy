/**
 * Implementacion de la interfaz Camara que representa una camara con tres lentes.
 */
public class CamaraTres implements Camara{

    /**
     * Almacena el tipo de camara.
     */
    private String tipo = "";

    /**
     * Establece el tipo de camara como "Tres camaras".
     */
    @Override
    public void crearCamara (){
        tipo = "Tres camaras";
    }

    /**
     * Imprime el tipo de camara en la consola.
     */
    @Override
    public void getTipo(){
        System.out.println(tipo);
    }
}