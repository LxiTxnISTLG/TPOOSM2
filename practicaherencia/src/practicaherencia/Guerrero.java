package practicaherencia;

public class Guerrero extends Personaje {
	int espada;
	int armadura;
	
public Guerrero(String nombre, int fuerza, int inteligencia, int defensa, int vida, double posición, double contador, int espada, int armadura) {
    super(nombre, fuerza, inteligencia, defensa, vida, posición, contador);
	this.espada = espada;
	this.armadura = armadura;
}

public void atacar() {
		 System.out.println(nombre + " ataca con daño extra: " + espada);
	}
}


