/**
 * Implementacion de la interfaz Bateria que representa una bateria de 3500 mAh.
 */
public class Bateria3500 implements Bateria {

    /**
     * Almacena el tipo de bateria.
     */
    private String tipo;

    /**
     * Establece la capacidad de la bateria a 3500 mAh.
     */
    @Override
    public void crearBateria() {
        tipo = "3500 mah";
    }

    /**
     * Imprime la capacidad de la bateria en la consola.
     */
    @Override
    public void getTipo() {
        System.out.println(tipo);
    }
}
