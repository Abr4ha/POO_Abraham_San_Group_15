public class Libros {
    private String titulo, autor, isbn;
    private int ejemplares;
    public Libros(){
    }
    public Libros(String titulo, String autor, String isbn, int ejemplares){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.ejemplares = ejemplares;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.titulo = titulo;
    }
    public String getIsbn(){
        return isbn;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    public int getEjemplares(){
        return ejemplares;
    }
    public void setIsbn(int ejemplares){
        this.ejemplares = ejemplares;
    }
    
}
