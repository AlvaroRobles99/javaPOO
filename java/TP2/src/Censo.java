import java.util.ArrayList;

public class Censo {
    private String nombreCenso;
    private ArrayList<Familia> censo = new ArrayList<>();

    public Censo(String nombre) {
        this.nombreCenso = nombre;
    }

    public String getNombreCenso() {
        return nombreCenso;
    }

    public void setNombreCenso(String nombreCenso) {
        this.nombreCenso = nombreCenso;
    }

    public Integer calcularFamilias() {
        return censo.size();
    }

    public Integer calcularPersonas() {
        Integer cant = 0;
        for (Familia familia : censo) {
            cant += familia.getCantMiembros();
        }
        return cant;
    }

    public Double getPromedioCenso() {
        Double acumulador = 0.0;
        Integer cant = censo.size();
        for (Familia familia : censo) {
            acumulador += familia.getPromedioFamilia();
        }
        Double promedioCenso = acumulador / cant;
        return promedioCenso;
    }
}
