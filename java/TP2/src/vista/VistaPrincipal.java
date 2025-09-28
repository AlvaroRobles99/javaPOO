package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class VistaPrincipal extends JFrame {
    private JButton btnGestionPerfiles;
    private JButton btnGestionJuegos;
    private JButton btnJugar;
    private JButton btnSalir;
    private JLabel lblTitulo;
    private JPanel panelPrincipal;
    private Image imagenFondo;
    private Image imagenEscalada;
    
    // Colores amigables
    private final Color COLOR_BOTON = new Color(74, 144, 226, 200); // Con transparencia
    private final Color COLOR_BOTON_HOVER = new Color(54, 124, 206, 220);
    private final Color COLOR_TITULO = Color.WHITE;
    private final Color COLOR_BORDE = new Color(255, 255, 255, 150);

public VistaPrincipal() {
    cargarImagenFondo();
    inicializarComponentes();
    configurarVentana();
    hacerResponsive();
}
    
    private void cargarImagenFondo() {
    try {
        // Ruta corregida: /imagenes/fondoPrincipal
        imagenFondo = ImageIO.read(getClass().getResource("/imagenes/fondoPrincipal.jpg"));
        
        // Precargar y escalar inmediatamente
        escalarImagenFondo();
        
    } catch (Exception e) {
        System.err.println("No se pudo cargar la imagen de fondo: " + e.getMessage());
        // Crear fondo sólido como fallback
        imagenFondo = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = (Graphics2D) imagenFondo.getGraphics();
        g2d.setColor(new Color(30, 30, 70));
        g2d.fillRect(0, 0, 1, 1);
        g2d.dispose();
    }
}
    
    private void inicializarComponentes() {
        // Configuración básica de la ventana
        setTitle("Arcade - Sistema de Gestión de Minijuegos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Panel principal personalizado que dibuja la imagen de fondo
        panelPrincipal = new JPanel(new GridBagLayout()) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (imagenEscalada != null) {
                    // Dibujar la imagen escalada para cubrir todo el panel
                    g.drawImage(imagenEscalada, 0, 0, getWidth(), getHeight(), this);
                }
            }
        };
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 15, 15, 15);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        // Título con sombra para mejor legibilidad sobre imagen
        lblTitulo = new JLabel("🎮 ARCADE CLÁSICO 🎮");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 48));
        lblTitulo.setForeground(COLOR_TITULO);
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        
        // Agregar sombra al texto
        lblTitulo.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(Color.BLACK, 1),
            BorderFactory.createEmptyBorder(2, 2, 2, 2)
        ));
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.CENTER;
        panelPrincipal.add(lblTitulo, gbc);
        
        // Panel para los botones (transparente)
        JPanel panelBotones = new JPanel(new GridLayout(4, 1, 20, 20));
        panelBotones.setOpaque(false); // Importante: hacer transparente
        panelBotones.setBorder(BorderFactory.createEmptyBorder(40, 100, 40, 100));
        
        // Crear botones con transparencia
        btnGestionPerfiles = crearBotonTransparente("👤 GESTIÓN DE PERFILES");
        btnGestionJuegos = crearBotonTransparente("🎯 GESTIÓN DE JUEGOS");
        btnJugar = crearBotonTransparente("🚀 JUGAR!");
        btnSalir = crearBotonTransparente("❌ SALIR");
        
        panelBotones.add(btnGestionPerfiles);
        panelBotones.add(btnGestionJuegos);
        panelBotones.add(btnJugar);
        panelBotones.add(btnSalir);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelPrincipal.add(panelBotones, gbc);
        
        setContentPane(panelPrincipal);
    }
    
    private JButton crearBotonTransparente(String texto) {
        JButton boton = new JButton(texto) {
            @Override
            protected void paintComponent(Graphics g) {
                // Fondo semi-transparente
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.8f));
                g2.setColor(getBackground());
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 25, 25);
                g2.dispose();
                super.paintComponent(g);
            }
        };
        
        boton.setFont(new Font("Arial", Font.BOLD, 24));
        boton.setBackground(COLOR_BOTON);
        boton.setForeground(Color.WHITE);
        boton.setFocusPainted(false);
        boton.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(COLOR_BORDE, 2),
            BorderFactory.createEmptyBorder(15, 25, 15, 25)
        ));
        boton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        boton.setOpaque(false); // Importante para transparencia
        boton.setContentAreaFilled(false);
        
        // Efecto hover
        boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton.setBackground(COLOR_BOTON_HOVER);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton.setBackground(COLOR_BOTON);
            }
        });
        
        return boton;
    }
    
    private void configurarVentana() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setMinimumSize(new Dimension(800, 600));
        setLocationRelativeTo(null);
    }
    
    private void hacerResponsive() {
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                escalarImagenFondo();
                ajustarTamanos();
            }
        });
    }
    
   private void escalarImagenFondo() {
    if (imagenFondo != null && getWidth() > 0 && getHeight() > 0) {
        // Usar renderización más rápida para el escalado inicial
        imagenEscalada = imagenFondo.getScaledInstance(
            getWidth(), getHeight(), Image.SCALE_FAST);
    }
}
    
    private void ajustarTamanos() {
        int ancho = getWidth();
        int alto = getHeight();
        
        int tamanoFuenteTitulo = Math.max(24, Math.min(72, ancho / 25));
        int tamanoFuenteBotones = Math.max(16, Math.min(32, ancho / 50));
        
        lblTitulo.setFont(new Font("Arial", Font.BOLD, tamanoFuenteTitulo));
        
        Font fuenteBotones = new Font("Arial", Font.BOLD, tamanoFuenteBotones);
        btnGestionPerfiles.setFont(fuenteBotones);
        btnGestionJuegos.setFont(fuenteBotones);
        btnJugar.setFont(fuenteBotones);
        btnSalir.setFont(fuenteBotones);
        
        revalidate();
        repaint();
    }
    
    // Resto de métodos permanecen igual...
    public void agregarListenerGestionPerfiles(ActionListener listener) {
        btnGestionPerfiles.addActionListener(listener);
    }
    
    public void agregarListenerGestionJuegos(ActionListener listener) {
        btnGestionJuegos.addActionListener(listener);
    }
    
    public void agregarListenerJugar(ActionListener listener) {
        btnJugar.addActionListener(listener);
    }
    
    public void agregarListenerSalir(ActionListener listener) {
        btnSalir.addActionListener(listener);
    }
    
    public void mostrarVentana() {
        setVisible(true);
    }
    
    public void ocultarVentana() {
        setVisible(false);
    }
}