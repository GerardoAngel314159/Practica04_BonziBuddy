/**
 * Clase que representa a la fabrica de baterias para crear diferentes tipos de baterias
 */
public class FabricaBaterias extends AbstractFactory{
    
    @Override
    public Object getComponente(String tipoComponente){
        return getCamara(tipoComponente);
    }

    public Bateria getCamara(String tipoCamara){
        if(tipoCamara == null){
            return null;
        }else if(tipoCamara.equalsIgnoreCase("3500")){
            return new Bateria3500();
        }else if(tipoCamara.equalsIgnoreCase("4500")){
            return new Bateria4500();
        }else if(tipoCamara.equalsIgnoreCase("5000")){
            return new Bateria5000();
        }
        return null;
    }
}