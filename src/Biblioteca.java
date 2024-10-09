import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Biblioteca {
    //list<libro> es una lista de objeos que son libro
    private List<Libro> nombrevarlista_de_libros;

    public Biblioteca(){
        this.nombrevarlista_de_libros = new ArrayList<>();
    }

    public boolean Agregar_libro(String Titulo,String Autor,String ISBN,String Genero,int Cantidad,boolean Disponible){
        Libro libro = new Libro(Titulo, Autor, ISBN, Genero, Cantidad, Disponible);
        this.nombrevarlista_de_libros.add(libro);
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

    public List<Libro> buscarLibros(String Titulo){
        ArrayList<Libro> nombrelista_de_libros = new ArrayList<>();
        for(Libro libro : this.nombrevarlista_de_libros ){
            if(libro.getTitulo().equals(Titulo)){
                nombrelista_de_libros.add(libro);
            }
        }
        return nombrelista_de_libros;
    }

    public void prestarLibro(String Titulo){
        Libro libro = buscarLibro(Titulo);
        if(libro != null && libro.getDisponible()){
            libro.setDisponible(false);
            libro.prestar();
        }
    }

    public void devolverLibro(String Titulo){
        Libro libro = buscarLibro(Titulo);
        if(libro != null){
            libro.setDisponible(true);
            libro.devolver();
        }
    }
    public void eliminarlibro(String Titulo){
        for(Libro libro : this.nombrevarlista_de_libros ){
            if(libro.getTitulo().equals(Titulo)){
                this.nombrevarlista_de_libros.remove(libro);
                break;
            }
        }
    }
    public void mostrar_libros_disponibles(){
        for(Libro libro : this.nombrevarlista_de_libros ){
            if(libro.getDisponible()){
                System.out.println("Título: " + libro.getTitulo());
                System.out.println("Autor: " + libro.getAutor());
                System.out.println("Género: " + libro.getGenero());
                System.out.println("ISBN: " + libro.getISBN());
                System.out.println("Cantidad disponible: " + libro.getCantidad());
                System.out.println();
            }
        }
    }
}