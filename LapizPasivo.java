/**
 * Implementacion de la interfaz LapizTactil que representa una LapizTactil de tamanio fijo.
 */
public class LapizPasivo implements LapizTactil{

    /**
     * Almacena el tipo de LapizTactil en terminos de Activo o Pasivo.
     */
    String tipo = "";

    /**
     * Establece el modo del LapizTactil a un valor predeterminado de Pasivo.
     */
    @Override
    public void crearLapizTactil(){
        tipo = "Pasivo";
    }

    /**
     * Imprime el tamanio de la LapizTactil en la consola.
     */
    @Override
    public void getTipo(){
        System.out.println(tipo);
    }
}