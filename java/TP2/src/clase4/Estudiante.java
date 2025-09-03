public class Estudiante {
    // 1. DECLARAR EL ATRIBUTO ESTÁTICO para el próximo legajo.
    // Iniciar en un valor como 10001 para que sea más realista.
    private static int proximoLegajo = 10001;

    // 2. DECLARAR LOS ATRIBUTOS DE INSTANCIA (legajo, nombre, apellido).
    private int legajo;
    private String nombre;
    private String apellido;

    /**
     * Constructor para un nuevo estudiante.
     * TAREA: Completar este constructor.
     * Debe tomar el nombre y el apellido como parámetros.
     * Debe asignar el 'proximoLegajo' estático al legajo de esta instancia
     * y luego incrementar el contador estático para el próximo estudiante.
     */
    public Estudiante(String nombre, String apellido) {
       this.nombre = nombre;
       this.apellido = apellido;
       this.legajo = proximoLegajo;
       proximoLegajo ++;
    }

    public int getLegajo() {
        return this.legajo;
    }

    @Override
    public String toString() {
        return "Estudiante [Legajo: " + legajo + ", Nombre: " + apellido + ", " + nombre + "]";
    }
}