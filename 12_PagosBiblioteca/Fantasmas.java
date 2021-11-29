import javax.swing.JOptionPane;
public class Fantasmas extends Libros {
    int ejemplares;
    public Fantasmas(){
    }
    public Fantasmas(String titulo, String autor, String isbn, int ejemplares){
       /* this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;*/
        super(titulo, autor, isbn);
        this.ejemplares = ejemplares;
    }
/*
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
        this.autor = autor;
    }
    public String getIsbn(){
        return isbn;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }*/
    public int getEjemplares(){
        return ejemplares;
    }
    public void setIsbn(int ejemplares){
        this.ejemplares = ejemplares;
    
    public void mostrarFantasmas(){
        JOptionPane.showInternalMessageDialog(null,"El titulo del libro es: "+titulo+
                                "\nEl Autor es: "+autor+
                                "\nEl isbn del libro es: "+isbn+
                                "\nEl total de libros que hay son:"+ejemplares+"\n");                                
    }
    
}
