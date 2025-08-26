import java.io.IOException;
import java.util.Map;
import java.util.List;


public interface IExportar {

   public  void exportar(List<Map<String, String>> datos,String nombreArchivo) throws IOException;




   
}
