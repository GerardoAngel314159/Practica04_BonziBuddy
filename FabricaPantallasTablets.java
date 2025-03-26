/**
 * Clase que representa a la fabrica de pantallas para crear diferentes tipos de camaras
 */
public class FabricaPantallasTablets extends  AbstractFactory{
    
    @Override
    public Object getComponente(String tipoComponente){
        return getPantallaTablets(tipoComponente);
    }

    
    public Pantalla getPantallaTablets(String tipoPantallaTablets){
        if(tipoPantallaTablets == null){
            return null;
        }else if(tipoPantallaTablets.equalsIgnoreCase("8")){
            return new PantallaTamanoUnoT();
        }else if(tipoPantallaTablets.equalsIgnoreCase("9")){
            return new PantallaTamanoDosT();
        }else if(tipoPantallaTablets.equalsIgnoreCase("10")){
            return new PantallaTamanoTresT();
        }
        return null;
    }
}