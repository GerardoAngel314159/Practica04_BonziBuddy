/**
 * Implementacion de la interfaz Almacenamiento que representa una Almacenamiento de tamanio fijo.
 */
public class Gib250 implements Almacenamiento{

    /**
     * Almacena el tipo de Almacenamiento en terminos de GB.
     */
    String tipo = "";

    /**
     * Establece el tamanio de la Almacenamiento a un valor predeterminado de 250 GB.
     */
    @Override
    public void crearAlmacenamiento(){
        tipo = "250 GB";
    }

    /**
     * Imprime el tamanio de la Almacenamiento en la consola.
     */
    @Override
    public void getTipo(){
        System.out.println(tipo);
    }
}