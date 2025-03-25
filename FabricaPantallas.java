/**
 * Clase que representa a la fabrica de pantallas para crear diferentes tipos de camaras
 */
public class FabricaPantallas implements AbstractFactory{
    
    @Override
    public Object getComponente(String tipoComponente){
        return getPantalla(tipoComponente);
    }

    public Camara getPantalla(String tipoPantalla){
        if(tipoPantalla == null){
            return null;
        }else if(tipoPantalla.equalsIgnoreCase("6,1")){
            return new CamaraDos();
        }else if(tipoPantalla.equalsIgnoreCase("6,5")){
            return new CamaraTres();
        }else if(tipoPantalla.equalsIgnoreCase("6,8")){
            return new CamaraCuatro();
        }
        return null;
    }
}