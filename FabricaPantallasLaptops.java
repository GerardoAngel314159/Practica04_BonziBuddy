/**
 * Clase que representa a la fabrica de pantallas para crear diferentes tipos de camaras
 */
public class FabricaPantallasLaptops extends  AbstractFactory{
    
    @Override
    public Object getComponente(String tipoComponente){
        return getPantallaLaptops(tipoComponente);
    }

    
    public Pantalla getPantallaLaptops(String tipoPantallaLaptops){
        if(tipoPantallaLaptops == null){
            return null;
        }else if(tipoPantallaLaptops.equalsIgnoreCase("24")){
            return new PantallaTamanoUnoL();
        }else if(tipoPantallaLaptops.equalsIgnoreCase("25")){
            return new PantallaTamanoDosL();
        }else if(tipoPantallaLaptops.equalsIgnoreCase("27")){
            return new PantallaTamanoTresL();
        }
        return null;
    }
}