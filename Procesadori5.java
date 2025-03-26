/**
 * Implementacion de la interfaz Procesador de Procesadori5.
 */
public class Procesadori5 implements Procesador {

    /**
     * Almacena el tipo de Procesador
     */
    private String tipo;

    /**
     * Establece la capacidad de Procesador de Intel i5.
     */
    @Override
    public void crearProcesador() {
        tipo = "Procesador i5";
    }

    /**
     * Imprime el tipo de Procesador
     */
    @Override
    public void getTipo() {
        System.out.println(tipo);
    }
}