import java.time.LocalDate;
public class PerfilUsuario {

    private String nombreUsuario;
    private String nombreCompleto;
    private String email;
    private Integer anioNacimiento;

    public PerfilUsuario(String nombreUsuario,String email ){
      if (! (nombreUsuario.isEmpty())){
      this.nombreUsuario = nombreUsuario;}
       else{throw new IllegalArgumentException("El nobre esta vacio pruebe de nuevo");}

     setEmail(email);
     
    }
public void mostrarPerfil() {
        System.out.println("--- Perfil del Usuario ---");
        System.out.println("Nombre de Usuario: " + this.nombreUsuario);
        System.out.println("Nombre Completo: " + this.nombreCompleto);
        System.out.println("Email: " + this.email);
        System.out.println("Año de Nacimiento: " + this.anioNacimiento);
        System.out.println("-------------------------");
    }






public Integer getAnioNacimiento() {
    return anioNacimiento;
}
public String getNombreCompleto() {
    return nombreCompleto;
}
public String getEmail() {
    return email;
}
public String getNombreUsuario() {
    return nombreUsuario;
}


  public void setNombreCompleto(String nombre)  {
    if (! (nombre.isEmpty())){
      this.nombreCompleto = nombre;}
       else{throw new IllegalArgumentException("El nobre esta vacio pruebe de nuevo");}}
  
public void setEmail(String email){
   String arroba = "@";
     if (email.contains(arroba)) {
      this.email= email;}else{throw new IllegalArgumentException("el email no contiene el @ ingrese otro");}
}

public String setAnoNacimiento(Integer anio){
LocalDate fechaActual = LocalDate.now();
Integer anoActual = fechaActual.getYear();
String res = "exito";
if(anio < anoActual && anio > 0 ){
  this.anioNacimiento = anio;
  return res;
}else{throw new IllegalArgumentException("el año ingresado no es correcto ingrese uno valido");}}







}
