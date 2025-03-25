/**
 * Interfaz que representa a las pantalla de los dispositivos
 * que usaran las clases de las diferentes pantallas
 */
public interface Pantalla{

    /**
     * Metodo que creara la Pantalla, su implementacion depende de la clase
     * que implemente la clase
     */
    public void crearPantalla();

    /**
     * Metodo que obtiene el tipo de pantalla que se creo
     */
    public void getTipo();


}