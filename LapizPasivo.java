/**
 * Representa a la clase de Lapiz pasivo que usaran las tablets
 * implementando la interfaz LapizTactil
 */
public class LapizPasivo implements LapizTactil{

    /**Representa al tipo de lapiz tactil que es */
    private String tipo;

    /**
     * Metodo que cambia el valor de tipo a Lapiz Pasivo
     */
    @Override
    public void crearLapizTactil(){
        tipo= "Lapiz Pasivo";
    }


    /**
    * Imprime el tipo de Lapiz
    */
    @Override
    public void getTipo() {
        System.out.println(tipo);
    }
}