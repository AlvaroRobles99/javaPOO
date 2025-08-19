package clase6;
public class ServicioSMS implements INotificable {

    public void enviar(Notificacion noti){
       System.out.println("--> Se a enviado por SMS una " + noti.toString() );
    }
    
}
// TODO 4: Declare la clase pública 'ServicioSms'.
// La clase debe implementar la interfaz 'INotificable'.

// TODO 5: Implemente el método 'enviar' requerido por la interfaz.
// Dentro del método, simule el envío de un SMS imprimiendo un mensaje
// en la consola.
// Ejemplo: "-> SMS enviado a [usuario]: [mensaje]"
