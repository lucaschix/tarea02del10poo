import java.util.Scanner;
public class Main {
    private static Biblioteca biblioteca;

    public static void main(String[] args) {
        // 1. Crear un objeto de la clase Biblioteca
        biblioteca = new Biblioteca(); // Usa la variable de clase

        mostrarMenu(); // Llama al menú después de inicializar la biblioteca
    }


    public static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        String Titulo = "";

        do {
            System.out.println("** Biblioteca Menu **");
            System.out.println("1. Agregar Libro");
            System.out.println("2. Buscar Libro");
            System.out.println("4. Prestar Libro");
            System.out.println("5. Devolver Libro");
            System.out.println("6. Eliminar Libro");
            System.out.println("7. Mostrar Libros Disponibles");
            System.out.println("8. Salir");

            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    biblioteca.Agregar_libro();
                    break;
                case 2:
                    System.out.print("Ingrese el título del libro: ");
                    Titulo = scanner.next(); // Captura el título ingresado por el usuario
                    Libro libro = biblioteca.buscarLibro(Titulo);
                    if (libro != null) {
                        System.out.println("Libro encontrado: " + libro);
                    } else {
                        System.out.println("Libro no encontrado.");
                    }
                    break;

                case 3:

                    break;
                case 4:
                    biblioteca.prestarLibro();
                    break;
                case 5:
                    biblioteca.devolverLibro();
                    break;
                case 6:
                    biblioteca.eliminarlibro();
                    break;
                case 7:
                    biblioteca.mostrar_libros_disponibles();
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 8);
    }
}

