/**
 * Clase que representa a la fabrica de camaras para crear diferentes tipos de Lapices.
 */
public class FabricaLapicesTactiles extends  AbstractFactory{
    
    @Override
    public Object getComponente(String tipoComponente){
        return getLapizTactil(tipoComponente);
    }

    public LapizTactil getLapizTactil(String tipoLapizTactil){
        if(tipoLapizTactil == null){
            return null;
        }else if(tipoLapizTactil.equalsIgnoreCase("dos")){
            return new LapizActivo();
        }else if(tipoLapizTactil.equalsIgnoreCase("tres")){
            return new LapizPasivo();
        }
        return null;
    }
}