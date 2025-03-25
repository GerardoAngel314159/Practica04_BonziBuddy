/**
 * Interfaz que representa a las camaras para poder crear los diferentes tipos de camaras 
 */
public interface Camara{

    /**
     * Metodo que se implementa en las distintas clases
     * de camara, cambian el atributo de tipo a el de la camara que van a crear
     */
    public void crearCamara();

    /**
     * Obtiene el tipo de Camara que se creo
     */
    public void getTipo();

}