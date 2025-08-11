import java.util.Calendar;

public class TesteoPerfil {

    public static void main(String[] args) {

        System.out.println("--- Creando perfiles con el diseño original (inseguro) ---");


        // Después de refactorizar PerfilUsuario, las líneas de código anteriores deberían generar errores de compilación o ser manejadas por la lógica de la clase.
        
        System.out.println("\n--- Probando el NUEVO diseño seguro (descomentar luego de refactorizar) ---");
        
        
        // DESCOMENTAR ESTA SECCIÓN TRAS LA REFACTORIZACIÓN
        
        // Caso 1: Creación exitosa con el constructor
        System.out.println("\nIntentando crear un perfil válido...");
        PerfilUsuario perfilSeguro1 = new PerfilUsuario("juan.perez", "juan.perez@dominio.com");
        perfilSeguro1.setNombreCompleto("Juan Pérez");
        perfilSeguro1.setAnoNacimiento(1990);
        perfilSeguro1.mostrarPerfil();

        // Caso 2: Intento de creación con datos inválidos
        System.out.println("\nIntentando crear un perfil con email inválido...");
    
        // El constructor o los setters deberían avisar del error.
        
        // Caso 3: Modificación controlada
        System.out.println("\nIntentando cambiar el email a un valor válido...");
        perfilSeguro1.setEmail("juan.nuevo@dominio.com");
        perfilSeguro1.mostrarPerfil();

        System.out.println("\nIntentando cambiar el año a un valor futuro...");
        perfilSeguro1.setAnoNacimiento(Calendar.getInstance().get(Calendar.YEAR) + 1);
        // El setter debería impedir esta acción.
        perfilSeguro1.mostrarPerfil();

        // Caso 4: Intentar cambiar el nombre de usuario (no debería ser posible)
        // perfilSeguro1.setNombreUsuario("jperez_nuevo"); // Esta línea debería dar error de compilación.

        
    }
}

    
    