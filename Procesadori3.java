/**
 * Implementacion de la interfaz Procesador de Procesadori3.
 */
public class Procesadori3 implements Procesador {

    /**
     * Almacena el tipo de Procesador
     */
    private String tipo;

    /**
     * Establece la capacidad de Procesador de Intel i3.
     */
    @Override
    public void crearProcesador() {
        tipo = "Procesador i3";
    }

    /**
     * Imprime el tipo de Procesador
     */
    @Override
    public void getTipo() {
        System.out.println(tipo);
    }
}