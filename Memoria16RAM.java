/**
 * Implementacion de la interfaz MemoriaRAM de tipo 16 gib
 */
public class Memoria16RAM implements MemoriaRAM {

    /**
     * Almacena el tipo de memoria RAM
     */
    private String tipo = "";

    /**
     * Establece la capacidad de memoria RAM de 16 gib.
     */
    @Override
    public void crearMemoriaRAM() {
        tipo = "16 gib";
    }

    /**
     * Imprime la capacidad de memoria RAM
     */
    @Override
    public void getTipo() {
        System.out.println(tipo);
    }
}