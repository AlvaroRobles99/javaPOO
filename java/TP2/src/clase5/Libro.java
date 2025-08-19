package clase5;

// TODO: Hacer que esta clase HEREDE de Producto
public class Libro extends Producto {
    private String autor;
    private String isbn;

    // TODO: Implementar el constructor de Libro.


    public Libro(String codigo,String nombre,double precio,String autor,String isbn){
        super(codigo,nombre,precio);
        this.autor = autor;
        this.isbn = isbn;
    }
 

    // // // TODO: Sobrescribir el método mostrarDetalle() para incluir el autor y el ISBN.
    // // // La implementación debe REUTILIZAR el método mostrarDetalle() de la clase padre.
     @Override
     public void mostrarDetalle() {
    super.mostrarDetalle() ; 
      System.out.println("Autor: " + this.autor);
      System.out.println("ISBN : " + this.isbn);;
     }
}


