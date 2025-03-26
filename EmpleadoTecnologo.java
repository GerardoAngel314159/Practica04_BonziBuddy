public class EmpleadoTecnologo {
    /**
     * Metodo que retorna la fabrica de acuerdo a la opcion seleccionada
     * @param opcion
     * @return
     */

	
	public static AbstractFactory getFactory(String opcion){
        String opcion2 = opcion.toLowerCase();
            return switch (opcion2) {
                case "procesador" -> new FabricaProcesadores();
                case "camara" -> new FabricaCamaras();
                case "lapiz" -> new FabricaLapicesTactiles();
                case "RAM" -> new FabricaRAM();
                case "almacenamiento" -> new FabricaAlmacenamiento();
                case "bateria" -> new FabricaBaterias();
                case "pantalla" -> new FabricaPantallas();
                default -> null;
            };
    }
}