/**
 * Interfaz que representa a las MemoriaRAMs para poder crear los diferentes tipos de MemoriaRAMs
 */
public interface MemoriaRAM{

    /**
     * Metodo que se implementa en las distintas clases
     * de MemoriaRAMs, cambian el atributo de tipo a el de MemoriaRAM que van a crear
     */
    public void crearMemoriaRAM();

    /**
     * Obtiene el tipo de MemoriaRAM que se creo
     */
    public void getTipo();

}
