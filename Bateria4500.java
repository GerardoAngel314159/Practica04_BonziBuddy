/**
 * Implementacion de la interfaz Bateria que representa una bateria de 4500 mAh.
 */
public class Bateria4500 implements Bateria{

    /**
     * Almacena el tipo de bateria.
     */
    String tipo = "";

    /**
     * Establece la capacidad de la bateria a 4500 mAh.
     */
    @Override
    public void crearBateria(){
        tipo = "4500 mah";
    }

    /**
     * Imprime la capacidad de la bateria en la consola.
     */
    @Override
    public void getTipo(){
        System.out.println(tipo);
    }
}