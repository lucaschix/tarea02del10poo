import java.util.Scanner;
public class Main {
    private static Biblioteca biblioteca;

    public static void main(String[] args) {
        // 1. Crear un objeto de la clase Biblioteca
        Biblioteca biblioteca = new Biblioteca();
        mostrarMenu();
        biblioteca.Agregar_libro("El Señor de los Anillos", "J.R.R. Tolkien", "1234567890", "Fantasía", 5, true);
        biblioteca.Agregar_libro("El Hobbit", "J.R.R. Tolkien", "9876543210", "Fantasía", 3, true);
        biblioteca.Agregar_libro("La Sombra del Viento", "Carlos Ruiz Zafón", "1111111111", "Misterio", 2, true);
        biblioteca.Agregar_libro("El Código Da Vinci", "Dan Brown", "2222222222", "Misterio", 4, true);

    }

    public static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        String Titulo = "";

        do {
            System.out.println("** Biblioteca Menu **");
            System.out.println("1. Agregar Libro");
            System.out.println("2. Buscar Libro");
            System.out.println("3. Buscar Libros");
            System.out.println("4. Prestar Libro");
            System.out.println("5. Devolver Libro");
            System.out.println("6. Eliminar Libro");
            System.out.println("7. Mostrar Libros Disponibles");
            System.out.println("8. Salir");

            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    biblioteca.buscarLibro(Titulo );
                    break;
                case 3:
                    biblioteca.buscarLibros(Titulo);
                    break;
                case 4:
                    biblioteca.prestarLibro(Titulo);
                    break;
                case 5:
                    biblioteca.devolverLibro(Titulo);
                    break;
                case 6:
                    biblioteca.eliminarlibro(Titulo);
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

