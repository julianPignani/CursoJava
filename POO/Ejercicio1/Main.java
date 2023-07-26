package Ejercicio1;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Julian",27,"27-06-1996", 39614001);
        persona1.mostrarDatos();
        persona1.esMayorDeEdad();

        Persona persona2 = new Persona("Lucia",17,"14-08-2000", 39614001);
        persona2.mostrarDatos();
        persona2.esMayorDeEdad();
    }
}
