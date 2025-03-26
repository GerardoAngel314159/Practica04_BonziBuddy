/**
 * Representa a la clase de Tablet que se crearan
 */
public class Tablet{

    /**Atributos de la clase */

    /**Representa  a la pantalla de la Tablet */
    private Pantalla pantalla;

    /**Representa a el lapiz tactil de la tablet */
    private LapizTactil lapizTactil;

    /**Representa a la camara que tendra la tablet */
    private Camara camara;

    /**
     * Metodo constructor de la clase 
     * @param pantalla de tipo Pantalla que usara la tablet
     * @param lapizTactil de tipo LapizTactil que usara la tablet
     * @param camara de tipo Camara que usara la tablet
     */
    public Tablet (Pantalla pantalla,  LapizTactil lapizTactil , Camara camara){
        this.pantalla = pantalla;
        this.lapizTactil = lapizTactil;
        this.camara = camara;
    }

    /**
     * Metodo que muestra la Tablet construida
     */
    public void muestraTablet(){
        System.out.println("La Tablet construida es la siguiente: ");
        pantalla.getTipo();
        lapizTactil.getTipo();
        camara.getTipo();
    }
}