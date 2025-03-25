/**
 * Clase que representa a la fabrica de camaras para crear diferentes tipos de camaras
 */
public class FabricaCamaras extends  AbstractFactory{
    
    @Override
    public Object getComponente(String tipoComponente){
        return getCamara(tipoComponente);
    }

    public Camara getCamara(String tipoCamara){
        if(tipoCamara == null){
            return null;
        }else if(tipoCamara.equalsIgnoreCase("dos")){
            return new CamaraDos();
        }else if(tipoCamara.equalsIgnoreCase("tres")){
            return new CamaraTres();
        }else if(tipoCamara.equalsIgnoreCase("cuatro")){
            return new CamaraCuatro();
        }
        return null;
    }
}