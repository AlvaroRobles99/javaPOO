import vista.VistaPrincipal;
import controlador.ControladorPrincipal;
import javax.swing.UIManager;

public class App {
    public static void main(String[] args) {
        // Configurar el Look and Feel del sistema
        try {
            UIManager.setLookAndFeel(UIManager.getLookAndFeel());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Crear la vista
        VistaPrincipal vista = new VistaPrincipal();
        
        // Crear el controlador y pasarle la vista
        ControladorPrincipal controlador = new ControladorPrincipal(vista);
        
        // Iniciar la aplicación
        controlador.iniciarAplicacion();
    }
}