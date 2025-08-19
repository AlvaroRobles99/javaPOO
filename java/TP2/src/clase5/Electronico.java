package clase5;

public class Electronico extends Producto {
    private String fabricante;
    private int mesesGarantia;


   
    public Electronico(String codigo,String nombre,double precio,String fabricante,int mesesGarantia){
        super(codigo,nombre,precio);
        this.fabricante = fabricante;
        this.mesesGarantia = mesesGarantia;
    }
    // TODO: Sobrescribir el método mostrarDetalle() para incluir el fabricante y la garantía.
    // Reutilizar la implementación de la superclase es fundamental.
    @Override
    public void mostrarDetalle() { super.mostrarDetalle();
       System.out.println("Fabricante: " + this.fabricante);
       System.out.println("mesesGarantia: " + this.mesesGarantia);
    }
        }
