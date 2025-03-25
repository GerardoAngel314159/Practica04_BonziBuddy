public class PantallaTamanoDos implements Pantalla{

    String tipo = "";

    @Override
    public void crearCamara (){
        tipo = "6,5";
    }

    @Override
    public void getTipo(){
        System.out.println(tipo);
    }
}