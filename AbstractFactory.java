/**
 * interfaz que representa a la fabrica para el patron abstract Factory
 */
public interface AbstractFactory{

    /**
     * Metodo que obtiene los componentes 
     * @param tipoComponente de tipo String
     * @return un componente de
     */
    public Object getComponente(String tipoComponente);
}