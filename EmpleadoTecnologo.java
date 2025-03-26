public class EmpleadoTecnologo {
    /**
     * Metodo que retorna la fabrica de acuerdo a la opcion seleccionada
     * @param opcion
     * @return
     */

	
	public AbstractFactory getFactory(String opcion){
        String opcion2 = opcion.toLowerCase();
            return switch (opcion2) {
                case "procesador" -> new FabricaProcesadores();
                case "camara" -> new FabricaCamaras();
                case "lapiz" -> new FabricaLapicesTactiles();
                case "ram" -> new FabricaRAM();
                case "almacenamiento" -> new FabricaAlmacenamiento();
                case "bateria" -> new FabricaBaterias();
                case "pantalla celular" -> new FabricaPantallas();
                case "pantalla tablet" -> new FabricaPantallasTablets();
                case "pantalla laptop" -> new FabricaPantallasLaptops();
                default -> null;
            };
    }
}