public class PantallaTamanoTres implements Pantalla{

    String tipo = "";

    @Override
    public void crearCamara (){
        tipo = "6,8";
    }

    @Override
    public void getTipo(){
        System.out.println(tipo);
    }
}