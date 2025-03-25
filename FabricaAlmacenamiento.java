/**
 * Clase que representa a la fabrica de camaras para crear diferentes tipos de camaras
 */
public class FabricaAlmacenamiento extends  AbstractFactory{
    
    @Override
    public Object getComponente(String tipoComponente){
        return getAlmacenamiento(tipoComponente);
    }

    public Almacenamiento getAlmacenamiento(String tipoAlmacenamiento){
        if(tipoAlmacenamiento == null){
            return null;
        }else if(tipoAlmacenamiento.equalsIgnoreCase("250 gib")){
            return new Gib250();
        }else if(tipoAlmacenamiento.equalsIgnoreCase("500 gib")){
            return new Gib500();
        }else if(tipoAlmacenamiento.equalsIgnoreCase("1000 gib")){
            return new Gib1000();
        }
        return null;
    }
}