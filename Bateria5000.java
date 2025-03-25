/**
 * Implementacion de la interfaz Bateria que representa una bateria de 5000 mAh.
 */    
public class Bateria5000 implements Bateria{

    /**
     * Almacena el tipo de bateria.
     */
    String tipo = "";

    /**
     * Establece la capacidad de la bateria a 5000 mAh.
     */
    @Override
    public void crearBateria(){
        tipo = "5000 mah";
    }

    /**
     * Imprime la capacidad de la bateria en la consola.
     */
    @Override
    public void getTipo(){
        System.out.println(tipo);
    }
}