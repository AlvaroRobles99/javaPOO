import java.time.LocalDate;
public class App {
    public static void main(String[] args) throws Exception {
       Persona persona1 = new Persona("Alvaro","Robles",LocalDate.of(1999,12,8),"m",false,true);
       Persona persona2 = new Persona("Simon","Gonzalez",LocalDate.of(2005,10,24),"f",false,false);
       Persona persona3 = new Persona("Lorenzo","Pacheco",LocalDate.of(1980,1,9),"m",true,true);
       
       System.out.println(persona1.toString());
       System.out.println(persona2.toString());
       System.out.println(persona3.toString());
    }
}
