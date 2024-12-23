package definicion_de_clases;

public class CriaturaFantastica {
	private String nombre;
	private String especie;
	private String subespecie;
	private String color;
	private double altura; // en metros
	private double peso; // en kilogramos
	private int edad; // en años
	private int nivelDePeligrosidad; // escala de 1-10
	private String alimentacion; // Herbívoro,Carnívoro, omnívoro 
	private String habitat; // Bosque montaña, desierto, etc 
	private boolean enPeligroDeExtincion; // Verdadero O Falso
	private String comportamiento; // Diurno, nocturno, crespucular 
	private String habilidadesEspeciales; //Ejemplo: "Invisibilidad, escupir fuego"
	private String sonidoCaracteristico; // Ejemplo: "Rugido"
    private String origen; // Mitología, experimento, etc.
    private String tipoDeSangre; // Ejemplo: "Fría", "Caliente"
    private int numeroDeExtremidades; // Número de patas, alas, etc.
    private boolean puedeVolar; // true o false
    private boolean esMagico; // true o false
    private String afinidadConHumanos; // Amistoso, neutral, hostil	
    

	//Constructor
	public CriaturaFantastica(String nombre, String especie, String subespecie, String color, double altura, double peso, 
                           int edad, int nivelDePeligrosidad, String alimentacion, String habitat, boolean enPeligroDeExtincion, 
                           String comportamiento, String habilidadesEspeciales, String sonidoCaracteristico, String origen, 
                           String tipoDeSangre, int numeroDeExtremidades, boolean puedeVolar, boolean esMagico, 
                           String afinidadConHumanos) {
    this.nombre = nombre;
    this.especie = especie;
    this.subespecie = subespecie;
    this.color = color;
    this.altura = altura;
    this.peso = peso;
    this.edad = edad;
    this.nivelDePeligrosidad = nivelDePeligrosidad;
    this.alimentacion = alimentacion;
    this.habitat = habitat;
    this.enPeligroDeExtincion = enPeligroDeExtincion;
    this.comportamiento = comportamiento;
    this.habilidadesEspeciales = habilidadesEspeciales;
    this.sonidoCaracteristico = sonidoCaracteristico;
    this.origen = origen;
    this.tipoDeSangre = tipoDeSangre;
    this.numeroDeExtremidades = numeroDeExtremidades;
    this.puedeVolar = puedeVolar;
    this.esMagico = esMagico;
    this.afinidadConHumanos = afinidadConHumanos;
}
	
	// Métodos para mostrar información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Subespecie: " + subespecie);
        System.out.println("Color: " + color);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Edad: " + edad + " años");
        System.out.println("Nivel de peligrosidad: " + nivelDePeligrosidad + "/10");
        System.out.println("Alimentación: " + alimentacion);
        System.out.println("Hábitat: " + habitat);
        System.out.println("En peligro de extinción: " + (enPeligroDeExtincion ? "Sí" : "No"));
        System.out.println("Comportamiento: " + comportamiento);
        System.out.println("Habilidades especiales: " + habilidadesEspeciales);
        System.out.println("Sonido característico: " + sonidoCaracteristico);
        System.out.println("Origen: " + origen);
        System.out.println("Tipo de sangre: " + tipoDeSangre);
        System.out.println("Número de extremidades: " + numeroDeExtremidades);
        System.out.println("¿Puede volar?: " + (puedeVolar ? "Sí" : "No"));
        System.out.println("¿Es mágico?: " + (esMagico ? "Sí" : "No"));
        System.out.println("Afinidad con humanos: " + afinidadConHumanos);
    }
}
