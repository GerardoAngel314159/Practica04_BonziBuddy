/**
 * Clase que representa a la fabrica de pantallas para crear diferentes tipos de camaras
 */
public class FabricaPantallas extends  AbstractFactory{
    
    @Override
    public Object getComponente(String tipoComponente){
        return getPantalla(tipoComponente);
    }

    
    public Pantalla getPantalla(String tipoPantalla){
        if(tipoPantalla == null){
            return null;
        }else if(tipoPantalla.equalsIgnoreCase("6,1")){
            return new PantallaTamanoUno();
        }else if(tipoPantalla.equalsIgnoreCase("6,5")){
            return new PantallaTamanoDos();
        }else if(tipoPantalla.equalsIgnoreCase("6,8")){
            return new PantallaTamanoTres();
        }
        return null;
    }
}