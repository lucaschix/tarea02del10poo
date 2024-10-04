import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 1. Crear un objeto de la clase Biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // 2. Crear varios objetos de la clase Libro y agregarlos a la biblioteca
        biblioteca.Agregar_libro("El Señor de los Anillos", "J.R.R. Tolkien", "1234567890", "Fantasía", 5, true);
        biblioteca.Agregar_libro("El Hobbit", "J.R.R. Tolkien", "9876543210", "Fantasía", 3, true);
        biblioteca.Agregar_libro("La Sombra del Viento", "Carlos Ruiz Zafón", "1111111111", "Misterio", 2, true);
        biblioteca.Agregar_libro("El Código Da Vinci", "Dan Brown", "2222222222", "Misterio", 4, true);
    }


}
