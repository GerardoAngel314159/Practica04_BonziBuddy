/**
 * Interfaz que representa a las Almacenamientos para poder crear los diferentes tipos de Almacenamientos
 */
public interface Almacenamiento{

    /**
     * Metodo que se implementa en las distintas clases
     * de Almacenamientos, cambian el atributo de tipo a el de Almacenamiento que van a crear
     */
    public void crearAlmacenamiento();

    /**
     * Obtiene el tipo de Almacenamiento que se creo
     */
    public void getTipo();

}
