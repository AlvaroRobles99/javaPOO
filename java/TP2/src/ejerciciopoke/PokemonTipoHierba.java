package ejerciciopoke;
import java.util.Random;

public class PokemonTipoHierba extends Pokemon{
	
	public PokemonTipoHierba(String nombre) {
		super(nombre);
		this.tipo = "Hierba";
		this.debilidad = "Fuego";
	}
	
	public void defensa(Integer ataque) {
		Integer danio;
		danio = this.defensa - ataque;
		
		if(danio >= 0) danio = 0;
		
		this.vida += danio;
		
		if (this.velocidad >= 50) {
			if(new Random().nextBoolean()) {
				return;
			}
			
			if(this.vida <= 0) {
				System.out.println("PERDIO");
				return;
			}
		}
		
		if(this.vida <= 0) {
			System.out.println("PERDIO");
			return;
		}
	}
	
}
