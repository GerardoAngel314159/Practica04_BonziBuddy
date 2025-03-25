/**
 * Clase que representa a la fabrica de camaras para crear diferentes tipos de camaras
 */
public class FabricaRAM extends  AbstractFactory{
    
    @Override
    public Object getComponente(String tipoComponente){
        return getMemoriaRAM(tipoComponente);
    }

    public MemoriaRAM getMemoriaRAM(String tipoMemoriaRAM){
        if(tipoMemoriaRAM == null){
            return null;
        }else if(tipoMemoriaRAM.equalsIgnoreCase("8 gib")){
            return new Memoria8RAM();
        }else if(tipoMemoriaRAM.equalsIgnoreCase("16 gib")){
            return new Memoria16RAM();
        }else if(tipoMemoriaRAM.equalsIgnoreCase("32 gib")){
            return new Memoria32RAM();
        }
        return null;
    }
}