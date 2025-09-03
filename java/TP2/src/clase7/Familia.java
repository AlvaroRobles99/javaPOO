import java.util.ArrayList;

public class Familia {
    private String apellido;
    private Integer cantMiembros;
    private ArrayList<Persona> listaMiembros = new ArrayList<Persona>();

    public Familia(String apellido) {
        this.apellido = apellido;

    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void agregarMiebro(Persona miembro) {
        this.listaMiembros.add(miembro);
        this.cantMiembros++;
    }

    public Integer getCantMiembros() {
        return cantMiembros;
    }

    public Double getPromedioFamilia() {
        Integer acumulador = 0;
        Integer largo = listaMiembros.size();
        for (Persona persona : listaMiembros) {
            acumulador += persona.calcularEdad();
        }
        double promedio = acumulador / largo;
        return promedio;
    }

}
