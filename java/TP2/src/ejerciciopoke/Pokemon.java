package ejerciciopoke;
import java.util.Random;

public abstract class Pokemon {
	
	protected String nombre;
	protected String tipo;
	protected Integer vida = 100;
	protected Integer ataque;
	protected Integer defensa;
	protected Integer velocidad;
	protected String debilidad;
	protected Integer salvajismo;
	
	public Pokemon(String nombre) {
		Random rnd = new Random();
		this.nombre = nombre;
		this.ataque = rnd.nextInt(0, 101);
		this.defensa = rnd.nextInt(0, 101);
		this.velocidad = rnd.nextInt(0, 101);
		this.salvajismo = rnd.nextInt(0, 101);
	}

	@Override
	public String toString() {
		return this.nombre + ',' + this.ataque + ',' + this.defensa + ',' +
				this.velocidad + ',' + this.salvajismo;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public abstract void defensa(Integer ataque);
	
	public void ataque(Pokemon pokemon) {
		Integer ataque;
		if(pokemon.getTipo().equals(this.debilidad)) {
			ataque  = (int) ((new Random().nextInt(11) < 7)?this.ataque * 1.50:this.ataque);
		}else {
			ataque = this.ataque;
		}
		pokemon.defensa(ataque);
	}
	
}
