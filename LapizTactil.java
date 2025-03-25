/**
 * Interfaz que representa a las LapizTactils para poder crear los diferentes tipos de LapizTactils
 */
public interface LapizTactil{

    /**
     * Metodo que se implementa en las distintas clases
     * de LapizTactils, cambian el atributo de tipo a el de LapizTactil que van a crear
     */
    public void crearLapizTactil();

    /**
     * Obtiene el tipo de LapizTactil que se creo
     */
    public void getTipo();

}
