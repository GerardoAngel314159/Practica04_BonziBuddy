/**
 * Representa a la clase de Lapiz activo que usaran las tablets
 * implementando la interfaz LapizTactil
 */
public class LapizActivo implements LapizTactil{

    /**Representa al tipo de lapiz tactil que es */
    private String tipo;

    /**
     * Metodo que cambia el valor de tipo a Lapiz Activo
     */
    public void crearLapiz(){
        tipo= "Lapiz Activo"
    }


    /**
    * Imprime el tipo de Lapiz
    */
    @Override
    public void getTipo() {
        System.out.println(tipo);
    }
}