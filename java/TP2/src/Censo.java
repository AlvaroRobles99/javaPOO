import java.util.ArrayList;

public class Censo {
    private String nombreCenso;
    private Integer cantFamilias;
    private Integer cantPersonas;
    private ArrayList<Familia> censo= new ArrayList<>();
    private Integer promedioEdad;

    public Censo(String nombre){
 this.nombreCenso = nombre;

    }
    public String getNombreCenso() {
        return nombreCenso;
    }
    public void setNombreCenso(String nombreCenso) {
        this.nombreCenso = nombreCenso;
    }
    public Integer getCantFamilias() {
        return cantFamilias;
    }
    public Integer getCantPersonas() {
        return cantPersonas;
    }
    public Integer getPromedioEdad() {
        return promedioEdad;
    }
}
