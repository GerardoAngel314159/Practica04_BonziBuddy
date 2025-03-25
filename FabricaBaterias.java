/**
 * Clase que representa a la fabrica de baterias para crear diferentes tipos de baterias
 */
public class FabricaBaterias extends AbstractFactory{
    
    @Override
    public Object getComponente(String tipoComponente){
        return getCamara(tipoComponente);
    }

    public Camara getCamara(String tipoCamara){
        if(tipoCamara == null){
            return null;
        }else if(tipoCamara.equalsIgnoreCase("3500")){
            return new CamaraDos();
        }else if(tipoCamara.equalsIgnoreCase("4500")){
            return new CamaraTres();
        }else if(tipoCamara.equalsIgnoreCase("5000")){
            return new CamaraCuatro();
        }
        return null;
    }
}