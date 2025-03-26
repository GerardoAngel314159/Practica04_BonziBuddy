/**
 * Representa a la clase de Laptop a crear 
 */
public class Laptop{

    /**Atributos de la clase */

    /**Representa a la pantalla de la Laptop */
    private Pantalla pantalla;

    /**Representa a el procesador de la Laptop */
    private Procesador procesador;


    /**Representa a la memoria RAM de la Laptop */
    private MemoriaRAM memoriaRAM;

    /**Representa a el alamcenamiento que tiene la Laptop */
    private Almacenamiento almacenamiento;

    /**
     * Metodo constructor de la clase Laptop
     * @param pantalla de tipo pantalla que usara la laptop
     * @param procesador de tipo Procesador que usara la Laptop
     * @param memoriaRAM de tipo MemoriaRAM que usara la Laptop
     * @param almacenamiento de tipo Almacenamiento que usara la Laptop
     */
    public Laptop (Pantalla pantalla, Procesador procesador, MemoriaRAM memoriaRAM, Almacenamiento almacenamiento){
        this.pantalla = pantalla;
        this.almacenamiento = almacenamiento;
        this.memoriaRAM = memoriaRAM;
        this.procesador = procesador;
    }

    /**
     * Metodo que muestra la Laptop construida
     */
    public void muestraLaptop(){
        System.out.println("La Laptop construida es la siguiente: ");
        pantalla.getTipo();
        procesador.getTipo();
        memoriaRAM.getTipo();
        almacenamiento.getTipo();
    }
}