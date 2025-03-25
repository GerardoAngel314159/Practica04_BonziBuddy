/**
 * Interfaz que representa a las baterias para poder crear los diferentes tipos de baterias
 */
public interface Bateria{

    /**
     * Metodo que se implementa en las distintas clases
     * de baterias, cambian el atributo de tipo a el de bateria que van a crear
     */
    public void crearBateria();

    /**
     * Obtiene el tipo de Bateria que se creo
     */
    public void getTipo();

}
