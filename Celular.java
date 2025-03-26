/**
 * Clase que representa a los celular a crear
 */
public class Celular{

    /**
     * Atributos de la clase
     */

    /**Representa a la pantalla del celular */
    private Pantalla pantalla;

    /**Representa a la bateria del celular */
    private Bateria bateria;

    /**Representa a las camaras del celular */
    private Camara camara;

    /**
     * Metodo contructor de la clase
     * @param pantalla de tipo Pantalla que usara el celular
     * @param bateria de tipo Bateria que usara el celular
     * @param camara de tipo Camara que usara el celular
     */
    public Celular (Pantalla pantalla, Bateria bateria, Camara camara){
        this.pantalla = pantalla;
        this.bateria = bateria;
        this.camara = camara;
    }

}