/**
 * Clase abstracta que representa a la fabrica para el patron abstract Factory
 */
public abstract class AbstractFactory{

    /**
     * Metodo que obtiene los componentes 
     * @param tipoComponente de tipo String
     * @return un componente de
     */
    abstract Object getComponente(String tipoComponente);
}