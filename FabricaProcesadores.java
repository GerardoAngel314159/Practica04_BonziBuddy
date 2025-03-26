/**
 * Clase que representa a la fabrica de procesador para crear diferentes procesador para laptop
 */
public class FabricaProcesadores extends  AbstractFactory{
    
    /**
     * Metodo que obtiene el componente de Procesdor de un dispositivo
     * @param tipoComponente 
     */
    @Override
    public Object getComponente(String tipoComponente){
        return getPantalla(tipoComponente);
    }

}