package practicaherencia;
public class Main {
    private String nombre;
    private int fuerza;
    private int inteligencia;
    private int defensa;
    private int vida;
    private double posición;
    private double contador;

    public Main(String nombre, int fuerza, int inteligencia, int defensa, int vida, double posición, double contador) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
        this.defensa = defensa;
        this.vida = vida;
        this.posición = posición;
        this.contador = contador;
    }

    public String getNombre() { return nombre; }
    public int getFuerza() { return fuerza; }
    public int getInteligencia() { return inteligencia; }
    public int getDefensa() { return defensa; }
    public int getVida() { return vida; }
    public double getPosición() { return posición; }
    public double getContador() { return contador; }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Fuerza: " + getFuerza());
        System.out.println("Inteligencia: " + getInteligencia());
        System.out.println("Defensa: " + getDefensa());
        System.out.println("Vida: " + getVida());
        System.out.println("Posición: " + getPosición());
        System.out.println("Contador: " + getContador());
    }
}
