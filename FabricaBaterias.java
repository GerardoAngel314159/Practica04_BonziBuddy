/**
 * Clase que representa a la fabrica de baterias para crear diferentes tipos de baterias
 */
public class FabricaBaterias extends AbstractFactory{
    
    @Override
    public Object getComponente(String tipoComponente){
        return getBatieria(tipoComponente);
    }

    public Bateria getBatieria(String tipoBatieria){
        if(tipoBatieria == null){
            return null;
        }else if(tipoBatieria.equalsIgnoreCase("3500")){
            return new Bateria3500();
        }else if(tipoBatieria.equalsIgnoreCase("4500")){
            return new Bateria4500();
        }else if(tipoBatieria.equalsIgnoreCase("5000")){
            return new Bateria5000();
        }
        return null;
    }
}