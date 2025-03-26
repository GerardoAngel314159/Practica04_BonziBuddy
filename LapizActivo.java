/**
 * Implementacion de la interfaz LapizTactil que representa una LapizTactil de tamanio fijo.
 */
public class LapizActivo implements LapizTactil{

    /**
     * Almacena el tipo de LapizTactil en terminos de Activo o Activo.
     */
    String tipo = "";

    /**
     * Establece el modo del LapizTactil a un valor predeterminado de Activo.
     */
    @Override
    public void crearLapizTactil(){
        tipo = "Lapiz Activo";
    }

    /**
     * Imprime el tamanio de la LapizTactil en la consola.
     */
    @Override
    public void getTipo(){
        System.out.println(tipo);
    }
}