public class CamaraTres implements Camara{

    String tipo = "";

    @Override
    public void crearCamara (){
        tipo = "Tres camaras";
    }

    @Override
    public void getTipo(){
        System.out.println(tipo);
    }
}