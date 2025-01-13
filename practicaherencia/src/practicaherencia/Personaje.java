package practicaherencia;

public class Personaje {
	String nombre;
	int fuerza;
	int inteligencia;
	int defensa;
	int vida;
	double posición;
	double contador;
	

public Personaje(String nombre, int fuerza, int inteligencia, int defensa, int vida, double posición,double contador) {
	this.nombre = nombre;
	this.fuerza = fuerza;
	this.inteligencia = inteligencia;
	this.defensa = defensa;
	this.vida = vida;
	this.posición = posición;
	this.contador = contador;
	}	
	
public void mostrarinformación( ) {
	System.out.println("Nombre: " + nombre);
	System.out.println("Fuerza: " + fuerza);
	System.out.println("inteligencia: " + inteligencia);
	System.out.println("defensa: " + defensa);
	System.out.println("vida: " + vida);
	System.out.println("posición: " + posición);
	System.out.println("contador: " + contador);
	}
}


