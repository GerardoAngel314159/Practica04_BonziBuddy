/**
 * Interfaz que representa a las Procesadors para poder crear los diferentes tipos de Procesadors
 */
public interface Procesador{

    /**
     * Metodo que se implementa en las distintas clases
     * de Procesadors, cambian el atributo de tipo a el de Procesador que van a crear
     */
    public void crearProcesador();

    /**
     * Obtiene el tipo de Procesador que se creo
     */
    public void getTipo();

}
