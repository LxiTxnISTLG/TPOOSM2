package practicaherencia;

public class Mago extends Personaje {
    int magia;
    int libro;

    public Mago(String nombre, int fuerza, int inteligencia, int defensa, int vida, double posición, double contador, int magia, int libro) {
        super(nombre, fuerza, inteligencia, defensa, vida, posición, contador); 
        this.magia = magia;
        this.libro = libro;
    }

    public void lanzarHechizo() {
        System.out.println(nombre + " lanza un hechizo con poder mágico: " + magia + " y libro: " + libro);
    }
}
