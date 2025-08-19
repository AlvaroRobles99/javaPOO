package clase6;

public class Main {
     public static void main(String[] args) {
        SistemaNotificaciones sistema = new SistemaNotificaciones();

        // TODO 10: Cree instancias de ServicioEmail y ServicioSms.
        ServicioSMS mandarSMS = new ServicioSMS();  
        ServicioEmail mandarEmail = new ServicioEmail();
        // TODO 11: Registre ambas instancias en el objeto 'sistema'.
        sistema.registrarServicio(mandarSMS);
        sistema.registrarServicio(mandarEmail);
        // TODO 12: Cree una nueva notificación y envíela a través del sistema.
        Notificacion notaGlobal = new Notificacion("Pepe", "Su pedido de MercadoLibre fue entregado en su domicilio.  ");
        sistema.enviarNotificacion(notaGlobal);
        System.out.println("\n--- Intentando registrar un servicio duplicado ---");
        // TODO 13: Intente registrar nuevamente la instancia de ServicioEmail.
        // Observe el comportamiento (no debería agregarse si se usó Set).
          sistema.registrarServicio(mandarSMS);
        // TODO 14: Cree y envíe una segunda notificación.
        Notificacion notaLocal = new Notificacion("Juan", "Su pedido se perdio en camino a distribucion disculpe por la molestias");
        sistema.enviarNotificacion(notaLocal);
        // TODO 15: Analice en equipo y responda mediante comentarios aquí mismo:
        // a) ¿Cuál es la ventaja de que SistemaNotificaciones dependa de INotificable y no de ServicioEmail o ServicioSms directamente?
        // b) Si mañana se necesitara agregar un ServicioPushNotification, ¿qué archivos se necesitarían crear o modificar? ¿Sería necesario cambiar SistemaNotificaciones.java?
    }    
}

