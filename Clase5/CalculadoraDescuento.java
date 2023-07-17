package Clase5;

import java.util.Scanner;

public class CalculadoraDescuento {
    public static void main(String[] args) {

        Scanner entrada = new  Scanner(System.in);

        System.out.println("Ingresa el precio del producto: ");
        double precioOriginal = entrada.nextDouble();

        System.out.println("Ingrese el porcentaje de descuento: ");
        double descuento = entrada.nextDouble();

        //Calculamos el precio final del producto con el descuento realizado
        double precioFinal = precioOriginal - (precioOriginal * descuento / 100);

        System.out.println("El precio final del producto es: " + precioFinal);
    }



}
