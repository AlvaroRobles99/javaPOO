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

public Persona(String nombre , String apellido,LocalDate fecha){
    this.apellido= apellido;
    this.nombre= nombre;
    this.fechaNacimiento = fecha;
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

public void setApellido(String apellido) {
    this.apellido = apellido;
}
public void setFechaNacimiento(LocalDate fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public Integer calcularEdad(){
    LocalDate hoy = LocalDate.now();
     Period periodo = Period.between(this.fechaNacimiento, hoy);
    Integer edad = periodo.getYears();
     return  edad;
}
@Override
public String toString(){
    return "El nombre completo es : " + nombre + " "  + " " + apellido + "\n" + "Edad :  " + calcularEdad();
}

}
