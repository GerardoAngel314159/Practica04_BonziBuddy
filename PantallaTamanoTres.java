/**
 * Implementacion de la interfaz Pantalla que representa una pantalla de tamanio fijo.
 */
public class PantallaTamanoTres implements Pantalla{

    /**
     * Almacena el tipo de pantalla en terminos de tamanio.
     */
    String tipo = "";

    /**
     * Establece el tamanio de la pantalla a un valor predeterminado de 6.8 pulgadas.
     */
    @Override
    public void crearPantalla(){
        tipo = "6,8";
    }

    /**
     * Imprime el tamanio de la pantalla en la consola.
     */
    @Override
    public void getTipo(){
        System.out.println(tipo);
    }
}