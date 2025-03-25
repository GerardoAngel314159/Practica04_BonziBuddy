public class PantallaTamanoUno implements Pantalla{

    String tipo = "";

    @Override
    public void crearCamara (){
        tipo = "6,1";
    }

    @Override
    public void getTipo(){
        System.out.println(tipo);
    }
}