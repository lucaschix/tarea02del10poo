import java.util.List;

public class Libro {
    private String Titulo;
    private String Autor;
    private String Genero;
    private String ISBN;
    private  int Cantidad;
    private boolean Disponible;
    public List<Libro> libros;

    public Libro(String Titulo, String Autor, String Genero,String ISBN, int Cantidad, boolean Disponible){
        this.Autor = Autor;
        this.Titulo= Titulo;
        this.Genero= Genero;
        this.ISBN= ISBN;
        this.Cantidad= Cantidad;
        this.Disponible= Disponible;


    }
    public String getAutor(){
        return Autor;
    }
    public String getTitulo(){
        return Titulo;
    }
    public String getGenero(){
        return Genero;
    }
    public String getISBN(){
        return ISBN;
    }
    public int getCantidad(){
        return Cantidad;
    }
    public boolean getDisponible(){
        return Disponible;
    }
    public void setAutor(String Autor){
        this.Autor=Autor;
    }
    public void setTitulo(String Titulo){
        this.Titulo=Titulo;
    }
    public void setGenero(String Genero){
        this.Genero=Genero;
    }
    public void setISBN(String ISBN){
        this.ISBN=ISBN;
    }
    public void setCantidad(int Cantidad){
        this.Cantidad=Cantidad;
    }
    public void setDisponible(boolean Disponible){
        this.Disponible=Disponible;
    }
    public String Mostrar_Libro(String Titulo){
        if(this.Titulo.equals(Titulo)){
            return "Titulo:"+ this.Titulo+"Autor: "+ this.Autor+"Genero:"+this.Genero+"ISBN:"+ this.ISBN+"Cantidad: "+this.Cantidad+ "Disponible:"+this.Disponible;
        }else{
            return null;
        }
    }
    public void prestar() {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(Titulo)) {
                libro.setCantidad(libro.getCantidad() - 1);
                return;
            }
        }
        System.out.println("No se encontró el libro");
    }
    public void devolver() {
        for (Libro libro : libros ) {
            if (libro.getTitulo().equals(Titulo)) {
                libro.setCantidad(libro.getCantidad() + 1);
                return;
            }
        }
        System.out.println("No se encontró el libro");
    }
   public String toString(){
        return "Titulo:"+ this.Titulo+"Autor: "+ this.Autor+"Genero:"+this.Genero+"ISBN:"+ this.ISBN+"Cantidad: "+this.Cantidad+ "Disponible:"+this.Disponible;
   }

}

