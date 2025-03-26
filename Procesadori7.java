/**
 * Implementacion de la interfaz Procesador de Procesadori7.
 */
public class Procesadori7 implements Procesador {

    /**
     * Almacena el tipo de Procesador
     */
    private String tipo = "";

    /**
     * Establece la capacidad de Procesador de Intel i7.
     */
    @Override
    public void crearProcesador() {
        tipo = "Procesador i7";
    }

    /**
     * Imprime el tipo de Procesador
     */
    @Override
    public void getTipo() {
        System.out.println(tipo);
    }
}