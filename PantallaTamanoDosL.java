/**
 * Implementacion de la interfaz Pantalla que representa una pantalla de tamanio fijo.
 */
public class PantallaTamanoDosL implements Pantalla{

    /**
     * Almacena el tipo de pantalla en terminos de tamanio.
     */
    String tipo;

    /**
     * Establece el tamanio de la pantalla a un valor predeterminado de 25 pulgadas.
     */
    @Override
    public void crearPantalla(){
        tipo = "25";
    }

    /**
     * Imprime el tamanio de la pantalla en la consola.
     */
    @Override
    public void getTipo(){
        System.out.println(tipo);
    }
}

