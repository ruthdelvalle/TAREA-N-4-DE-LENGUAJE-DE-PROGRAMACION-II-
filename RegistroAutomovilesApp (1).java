import java.util.Scanner;


public class RegistroAutomovilesApp {
    private static Scanner scanner = new Scanner(System.in);
   

    public static void main(String[] args) {
        boolean salir = false;

        while (!salir) {
            mostrarMenu(); //se llama a mostrarMenu() 
            //para mostrar las opciones disponibles y se lea la entrada del usuario para seleccionar una opción. 
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    crearRegistro();
                    break;
                case 2:
                    buscarRegistro();
                    break;
                case 3:
                    editarRegistro();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingresa una opción válida.");
            }
        }

        System.out.println("¡Hasta luego!");
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n=== Menú ===");
        System.out.println("1. Crear un registro");
        System.out.println("2. Buscar un registro");
        System.out.println("3. Editar un registro");
        System.out.println("4. Salir");
        System.out.print("Ingresa tu opción: ");
        //Este método imprime las opciones del menú en la consola 
        
    }

    private static void crearRegistro() {
        System.out.println("\n=== Crear un nuevo registro ===");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        System.out.print("Marca: ");
        int marca = scanner.nextInt();
        System.out.print("Modelo: ");
        int modelo = scanner.nextInt();
        //Solicita al usuario que ingrese información para crear un nuevo registro de automóvil, 
        //como ID, marca y modelo.
    }

    private static void buscarRegistro() {
        System.out.println("\n=== Buscar un registro ===");
        System.out.print("Ingresa el ID del registro a buscar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        // Llama al método correspondiente en la clase RegistroAutomoviles para buscar el registro
    }

    private static void editarRegistro() {
        System.out.println("\n=== Editar un registro ===");
        System.out.print("Ingresa el ID del registro a editar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        // Llama al método correspondiente en la clase RegistroAutomoviles para editar el registro
    }

}