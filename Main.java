
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmpleadoTecnologo empleado = new EmpleadoTecnologo();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Bienvenido a la tienda de tecnologia Banana Store!! :D");
            System.out.println("A continuacion indique si desea un 1)Celular 2)Computadora o 3)Tablet");
            int opcion = sc.nextInt();
            
            do{
                switch (opcion) {
                    case 1 -> crearCelular(empleado);
                    case 2 -> crearLaptop(empleado);
                    case 3 -> crearTablet(empleado);
                    default -> System.out.println("\nOpcion no valida");
                }
                
                System.out.println("\nDesea comprar algo mas? 1)Si 2)No");
                opcion = sc.nextInt();
                if (opcion == 2){
                    break;
                }
                
            } while (true);
            
            System.out.println("Gracias por su compra!! :D");
        }
    }



    public static void crearCelular(EmpleadoTecnologo empleado){
        AbstractFactory pantallas = empleado.getFactory("pantalla celular");
        AbstractFactory baterias = empleado.getFactory("bateria");
        AbstractFactory camaras = empleado.getFactory("camara");
        Camara camara;
        Pantalla pantalla;
        Bateria bateria;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Indique el tamaño de pantalla que desea (in): 1) 6,1 2)6,5 3)6,8");
            int tamano = sc.nextInt();
            switch (tamano){
                case 1 -> pantalla = (Pantalla)pantallas.getComponente("6,1");
                case 2 -> pantalla = (Pantalla)pantallas.getComponente("6,5");
                case 3 -> pantalla = (Pantalla)pantallas.getComponente("6,8");
                default -> pantalla = (Pantalla)pantallas.getComponente("6,1");
                
            }
            
            System.out.println("Indique la capacidad de la bateria que desea (mAh): 1) 3500 2)4500 3)5000");
            int capacidad = sc.nextInt();
            switch (capacidad){
                case 1 -> bateria = (Bateria)baterias.getComponente("3500");
                case 2 -> bateria = (Bateria)baterias.getComponente("4500");
                case 3 -> bateria = (Bateria)baterias.getComponente("5000");
                default -> bateria = (Bateria)baterias.getComponente("3500");
            }
            
            System.out.println("Indique el numero de camaras que desea: 1) Dos camaras 2) Tres camaras 3) Cuatro camaras");
            int numCamaras = sc.nextInt();
            switch (numCamaras){
                case 1 -> camara = (Camara)camaras.getComponente("dos");
                case 2 -> camara = (Camara)camaras.getComponente("tres");
                case 3 -> camara = (Camara)camaras.getComponente("cuatro");
                default -> camara = (Camara)camaras.getComponente("dos");
            }
        }

        Celular celular = new Celular(pantalla, bateria, camara);
        System.out.println("Celular creado con exito!!");
        celular.muestraCelular();
    }

    public static void crearTablet(EmpleadoTecnologo empleado){
        AbstractFactory pantallas = empleado.getFactory("pantalla tablet");
        AbstractFactory lapices = empleado.getFactory("lapiz");
        AbstractFactory camaras = empleado.getFactory("camara");
        try (Scanner sc = new Scanner(System.in)) {
            Pantalla pantalla;
            LapizTactil lapiz;
            Camara camara;
            
            System.out.println("Indique el tamaño de pantalla que desea (in): 1) 8 2) 9 3) 10");
            int tamano = sc.nextInt();
            switch (tamano){
                case 1 -> pantalla = (Pantalla)pantallas.getComponente("8");
                case 2 -> pantalla = (Pantalla)pantallas.getComponente("9");
                case 3 -> pantalla = (Pantalla)pantallas.getComponente("10");
                default -> pantalla = (Pantalla)pantallas.getComponente("8");
            }
            
            System.out.println("Indique el tipo de lapiz tactil: 1) Pasivo 2) Activo");
            int tipoLapiz = sc.nextInt();
            switch (tipoLapiz){
                case 1 -> lapiz = (LapizTactil)lapices.getComponente("pasivo");
                case 2 -> lapiz = (LapizTactil)lapices.getComponente("activo");
                default -> lapiz = (LapizTactil)lapices.getComponente("pasivo");
            }
            
            System.out.println("Indique el numero de camaras que desea: 1) Dos camaras 2) Tres camaras 3) Cuatro camaras");
            int numCamaras = sc.nextInt();
            switch (numCamaras){
                case 1 -> camara = (Camara)camaras.getComponente("dos");
                case 2 -> camara = (Camara)camaras.getComponente("tres");
                case 3 -> camara = (Camara)camaras.getComponente("cuatro");
                default -> camara = (Camara)camaras.getComponente("dos");
            }
            
            Tablet tablet = new Tablet(pantalla, lapiz, camara);
            System.out.println("Tablet creada con exito!!");
            tablet.muestraTablet();
        }

    }

    public static void crearLaptop(EmpleadoTecnologo empleado){
        AbstractFactory pantallas = empleado.getFactory("pantalla laptop");
        AbstractFactory procesador = empleado.getFactory("procesador");
        AbstractFactory ram = empleado.getFactory("ram");
        AbstractFactory almacenamiento = empleado.getFactory("almacenamiento");
        
        try (Scanner sc = new Scanner(System.in)) {
            Pantalla pantalla;
            Procesador procesadorLaptop;
            MemoriaRAM ramLaptop;
            Almacenamiento almacenamientoLaptop;
            
            System.out.println("Indique el tamaño de pantalla que desea (in): 1) 24 2) 25 3) 27");
            int tamano = sc.nextInt();
            switch (tamano){
                case 1 -> pantalla = (Pantalla)pantallas.getComponente("24");
                case 2 -> pantalla = (Pantalla)pantallas.getComponente("25");
                case 3 -> pantalla = (Pantalla)pantallas.getComponente("27");
                default -> pantalla = (Pantalla)pantallas.getComponente("24");
            }
            
            System.out.println("Indique el tipo de procesador que desea: 1) Intel i3 2) Intel i5 3) Intel i7");
            int tipoProcesador = sc.nextInt();
            switch (tipoProcesador){
                case 1 -> procesadorLaptop = (Procesador)procesador.getComponente("i3");
                case 2 -> procesadorLaptop = (Procesador)procesador.getComponente("i5");
                case 3 -> procesadorLaptop = (Procesador)procesador.getComponente("i7");
                default -> procesadorLaptop = (Procesador)procesador.getComponente("i3");
            }
            
            System.out.println("Indique la capacidad de la memoria RAM que desea (GB): 1) 8GB 2) 16GB 3) 32GB");
            int capacidadRAM = sc.nextInt();
            switch (capacidadRAM){
                case 1 -> ramLaptop = (MemoriaRAM)ram.getComponente("8 gib");
                case 2 -> ramLaptop = (MemoriaRAM)ram.getComponente("16 gib");
                case 3 -> ramLaptop = (MemoriaRAM)ram.getComponente("32 gib");
                default -> ramLaptop = (MemoriaRAM)ram.getComponente("8 gib");
            }
            
            System.out.println("Indique la capacidad de almacenamiento que desea (GB): 1) 256GB 2) 512GB 3) 1TB");
            int capacidadAlmacenamiento = sc.nextInt();
            switch (capacidadAlmacenamiento){
                case 1 -> almacenamientoLaptop = (Almacenamiento)almacenamiento.getComponente("250 gib");
                case 2 -> almacenamientoLaptop = (Almacenamiento)almacenamiento.getComponente("500 gib");
                case 3 -> almacenamientoLaptop = (Almacenamiento)almacenamiento.getComponente("1000 gib");
                default -> almacenamientoLaptop = (Almacenamiento)almacenamiento.getComponente("250 gib");
            }
            
            Laptop laptop = new Laptop(pantalla, procesadorLaptop, ramLaptop, almacenamientoLaptop);
            System.out.println("Laptop creada con exito!!");
            laptop.muestraLaptop();
        }
    }
}

