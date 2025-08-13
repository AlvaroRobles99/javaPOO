/*Defina la clase Persona con los atributos
● Nombre de tipo string
● Apellido de tipo string
● Fecha de nacimiento de tipo Date
Genere además un constructor que reciba tres parámetros(uno por atributo), los
métodos de acceso(getters y setters) de cada atributo y un método toString que retorne
una cadena con el valor de todos los atributos.
● Instancie tres veces la clase persona y por cada instancia imprima en consola el
valor devuelto por el método toString*/

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String nombre ;
    private String apellido ;
    private LocalDate fechaNacimiento;
    private String sexo;
    private Boolean trabaja;
    private Boolean estudia;

public Persona(String nombre , String apellido,LocalDate fecha, String sexo,Boolean trabaja, Boolean estudia){
    this.apellido= apellido;
    this.nombre= nombre;
    this.fechaNacimiento = fecha;
    this.sexo = sexo;
    this.trabaja = trabaja;
    this.estudia = estudia;
}

    public String getApellido() {
        return apellido;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public String getNombre() {
        return nombre;
    }
    public String getSexo() {
    return sexo;
}
public Boolean getEstudia() {
    return estudia;
}
public Boolean getTrabaja() {
    return trabaja;
}

public void setApellido(String apellido) {
    this.apellido = apellido;
}
public void setFechaNacimiento(LocalDate fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}

public void setSexo(String sexo) {
    this.sexo = sexo;
}
public void setTrabaja(Boolean trabaja) {
    this.trabaja = trabaja;
}
public void setEstudia(Boolean estudia) {
    this.estudia = estudia;
}

public Integer calcularEdad(){
    LocalDate hoy = LocalDate.now();
     Period periodo = Period.between(this.fechaNacimiento, hoy);
    Integer edad = periodo.getYears();
     return  edad;
}
@Override
public String toString(){
    return "El nombre completo es : " + nombre + " "  + " " + apellido + 
  "\n" + " Edad :  "  + calcularEdad() +
  "\n Sexo :"+ sexo + 
 "\n trabaja :" + trabaja +
    "\n estudia : " + estudia ;
}

}
