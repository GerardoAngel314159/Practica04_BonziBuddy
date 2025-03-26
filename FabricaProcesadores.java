//
// Clase que representa a la fabrica de camaras para crear diferentes tipos de camaras
//
public class FabricaProcesadores extends  AbstractFactory{
   
   @Override
   public Object getComponente(String tipoComponente){
       return getProcesador(tipoComponente);
   }

   public Procesador getProcesador(String tipoProcesador){
       if(tipoProcesador == null){
           return null;
       }else if(tipoProcesador.equalsIgnoreCase("i3")){
           return new Procesadori3();
       }else if(tipoProcesador.equalsIgnoreCase("i5")){
           return new Procesadori5();
       }else if(tipoProcesador.equalsIgnoreCase("i7")){
           return new Procesadori7();
       }
       return null;
   }
}