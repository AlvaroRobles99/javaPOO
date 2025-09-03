public class GestionAcademica {
    public static void main(String[] args) {
        System.out.println("== Sistema de Gestión Académica ==");

        Estudiante estudiante1 = new Estudiante("manuel", "roldan");
        Estudiante estudiante2 = new Estudiante("juan", "navarro");
        Estudiante estudiante3 = new Estudiante("ivan", "soto");

       Curso poo = new Curso("Programación Orientada a Objetos", 2);
       if(poo.inscribirEstudiante(estudiante1) ){
          System.out.println("Inscripción de " + estudiante1.getLegajo() + " exitosa.");
       }else{
           System.out.println("Inscripción de " + estudiante1.getLegajo() + " rechazada. Cupo completo.");
       };
       if(poo.inscribirEstudiante(estudiante2) ){
          System.out.println("Inscripción de " + estudiante2.getLegajo() + " exitosa.");
       }else{
           System.out.println("Inscripción de " + estudiante2.getLegajo() + " rechazada. Cupo completo.");
       };
       if(poo.inscribirEstudiante(estudiante3) ){
          System.out.println("Inscripción de " + estudiante3.getLegajo() + " exitosa.");
       }else{
           System.out.println("Inscripción de " + estudiante3.getLegajo() + " rechazada. Cupo completo.");
       };
       poo.mostrarInscriptos();
        Estudiante estudiante4 = new Estudiante("gabriel", "cardenas");
          System.out.println(estudiante4.toString());


    }
}