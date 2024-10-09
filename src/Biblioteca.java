import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Biblioteca {
    //list<libro> es una lista de objeos que son libro
    private List<Libro> nombrevarlista_de_libros;

    public Biblioteca(){
        this.nombrevarlista_de_libros = new ArrayList<>();
    }


    public boolean Agregar_libro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa  titulo, autor, ISBN, genero, cantidad y disponivilidad(true/false) del libro que desea agregar");
        String Titulo = scanner.nextLine();
        System.out.println("Ingresa el titulo, autor, ISBN, genero,cantidad y disponivilidad(true/false) del libro");
        String Autor = scanner.nextLine();
        String ISBN = scanner.nextLine();
        String Genero = scanner.nextLine();
        int Cantidad = scanner.nextInt();
        boolean Disponible = scanner.nextBoolean();
        Libro libro = new Libro(Titulo, Autor, Genero, ISBN, Cantidad, Disponible);
        this.nombrevarlista_de_libros.add(libro);
        System.out.println("Libro agregado con éxito.");
        return true;
    }
    public Libro buscarLibro(String Titulo){
        for(Libro libro : this.nombrevarlista_de_libros ){
            if(libro.getTitulo().equals(Titulo)){
                return libro;
            }
        }
        return null;
    }
    public void prestarLibro(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el tiulo del libro que deseas prestar");
        String Titulo = scanner.nextLine();
        Libro libro = buscarLibro(Titulo);
        if(libro != null && libro.getDisponible()){
            libro.setDisponible(false);
            libro.prestar();

        }
    }

    public void devolverLibro(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el tiulo del libro que deseas devolver");
        String Titulo = scanner.nextLine();
        Libro libro = buscarLibro(Titulo);
        if(libro != null){
            libro.setDisponible(true);
            libro.devolver();
        }
    }
    public void eliminarlibro(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el tiulo del libro que deseas eliminar");
        String Titulo = scanner.nextLine();
        for(Libro libro : this.nombrevarlista_de_libros ){
            if(libro.getTitulo().equals(Titulo)){
                this.nombrevarlista_de_libros.remove(libro);
                System.out.println("libro eliminado");
                break;
            }
        }
    }
    public void mostrar_libros_disponibles(){
        for(Libro libro : this.nombrevarlista_de_libros ){
            if(libro.getDisponible()){
                System.out.println("Listado de libros:\n Título: "+ libro.getTitulo()+" | Autor: " + libro.getAutor()+" | Género: " + libro.getGenero()+" | ISBN: " + libro.getISBN() +" | Cantidad disponible: " + libro.getCantidad());
            }
        }
    }
}