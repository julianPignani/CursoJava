package Clase5;

import java.util.Scanner;

public class ConversorVelocidad {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese una distancia en millas que deseas conocer en kilometros: ");
        float millas = entrada.nextFloat();

        //Convertir la distancia en millas a Kilometros
        float kilometros = (float) (millas * 1.60934);

        System.out.println("La distancia "+ millas +  " ingresada en millas es igual a " + kilometros + " kilometros");

    }
}
