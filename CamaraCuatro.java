public class CamaraCuatro implements Camara{

    String tipo = "";

    @Override
    public void crearCamara (){
        tipo = "Cuatro camaras";
    }

    @Override
    public void getTipo(){
        System.out.println(tipo);
    }
}