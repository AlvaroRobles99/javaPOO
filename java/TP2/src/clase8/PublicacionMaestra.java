package clase8;

public abstract class PublicacionMaestra {

    private String tipo; // "Libro", "Revista", etc.
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private Boolean sePresta;

    public PublicacionMaestra(String tipo, String titulo, String autor, int anio) {
        this.tipo = tipo;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anio;
        this.sePresta = true;
    }

     public  double calcularMulta(int diasDeRetraso){
        double multa = 0.0;
        // Futuros tipos de publicación requerirían más 'else if'...
        return multa;
     }
    public void imprimirDetalles() {
        System.out.println("Título: " + titulo + " (" + anioPublicacion + ")");
        System.out.println("Autor: " + autor);
    }

    public String getTipo() { return this.tipo; }
    public String getTitulo() { return this.titulo; }
    public String getAutor(){return this.autor;}
    public int getAnioPublicacion() {return this.anioPublicacion;}
   

    public void setAnioPublicacion(int anioPublicacion) {this.anioPublicacion = anioPublicacion;}
    public void setAutor(String autor) {this.autor = autor;}
    public void setTipo(String tipo) {this.tipo = tipo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}
    public void cambiarPrestamo(){
      this.sePresta = !this.sePresta;
    }
}
