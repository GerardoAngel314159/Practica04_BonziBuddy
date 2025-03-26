/**
 * Implementacion de la interfaz MemoriaRAM de tipo 32 gib
 */
public class Memoria32RAM implements MemoriaRAM {

    /**
     * Almacena el tipo de memoria RAM
     */
    private String tipo;

    /**
     * Establece la capacidad de memoria RAM de 32 gib.
     */
    @Override
    public void crearMemoriaRAM() {
        tipo = "32 gib";
    }

    /**
     * Imprime la capacidad de memoria RAM
     */
    @Override
    public void getTipo() {
        System.out.println(tipo);
    }
}