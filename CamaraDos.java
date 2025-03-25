public class CamaraDos implements Camara{

    String tipo = "";

    @Override
    public void crearCamara (){
        tipo = "Dos camaras";
    }

    @Override
    public void getTipo(){
        System.out.println(tipo);
    }
}