package controlador;

import vista.VistaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorPrincipal implements ActionListener {
    private VistaPrincipal vistaPrincipal;
    
    public ControladorPrincipal(VistaPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
        
        // Registrar este controlador como listener de los botones
        this.vistaPrincipal.agregarListenerGestionPerfiles(this);
        this.vistaPrincipal.agregarListenerGestionJuegos(this);
        this.vistaPrincipal.agregarListenerJugar(this);
        this.vistaPrincipal.agregarListenerSalir(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        
        switch (comando) {
            case "👤 GESTIÓN DE PERFILES":
                System.out.println("Abriendo gestión de perfiles...");
                // Aquí abriremos la vista de perfiles después
                break;
            case "🎯 GESTIÓN DE JUEGOS":
                System.out.println("Abriendo gestión de juegos...");
                // Aquí abriremos la vista de juegos después
                break;
            case "🚀 JUGAR!":
                System.out.println("Iniciando juego...");
                // Aquí la lógica para seleccionar y ejecutar juegos
                break;
            case "❌ SALIR":
                System.out.println("Saliendo de la aplicación...");
                System.exit(0);
                break;
        }
    }
    
    public void iniciarAplicacion() {
        vistaPrincipal.mostrarVentana();
    }
}