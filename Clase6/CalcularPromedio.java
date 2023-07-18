package Clase6;

import java.util.Scanner;

public class CalcularPromedio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa 3 números para poder calcularle el promedio: ");
        double num1 = teclado.nextDouble();
        double num2 = teclado.nextDouble();
        double num3 = teclado.nextDouble();

        double promedioTotal = (num1+num2+num3) / 3;

        System.out.println("el promedio de los números ingresados es: " + promedioTotal);

    }
}
