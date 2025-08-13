import java.util.ArrayList;

public class Familia {
    private String apellido;
    private Integer cantMiembros;
    private ArrayList<Persona> listaMiembros = new ArrayList<>();

public Familia(String apellido){
  this.apellido = apellido;

}

public String getApellido() {
    return apellido;
}
public void setApellido(String apellido) {
    this.apellido = apellido;
}
public  void agregarMiebro(Persona miembro){
this.listaMiembros.add(miembro);
this.cantMiembros ++;
}




}
