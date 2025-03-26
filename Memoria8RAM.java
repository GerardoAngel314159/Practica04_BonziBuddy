/**
 * Implementacion de la interfaz MemoriaRAM de tipo 8 gib
 */
public class Memoria8RAM implements MemoriaRAM {

    /**
     * Almacena el tipo de memoria RAM
     */
    private String tipo = "";

    /**
     * Establece la capacidad de memoria RAM de 8 gib.
     */
    @Override
    public void crearMemoriaRAM() {
        tipo = "8 gib";
    }

    /**
     * Imprime la capacidad de memoria RAM
     */
    @Override
    public void getTipo() {
        System.out.println(tipo);
    }
}