public class PantallaTamanoDos implements Pantalla{

    String tipo = "";

    @Override
    public void crearPantalla(){
        tipo = "6,5";
    }

    @Override
    public void getTipo(){
        System.out.println(tipo);
    }
}