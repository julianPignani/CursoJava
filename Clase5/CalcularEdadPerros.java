package Clase5;

import java.util.Scanner;

public class CalcularEdadPerros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Pedimos al usuario la edad de su perro
        System.out.println("Ingrese la edad de su perro por favor");
        Integer edad = entrada.nextInt();

        Integer edadPerro = edad * 7;
        System.out.println("Tu perro tiene " + edadPerro + " años caninos");
    }
}
