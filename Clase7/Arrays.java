package Clase7;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        //Hacer un programa que permita al usuario ingresar 5 números y mostrarlos
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];

        //Recorremos el tamaño del array y lo rellenamos con números
        for (int i = 0; i < numeros.length; i++){
            System.out.print("Ingrese un número: ");
            numeros[i] = teclado.nextInt();
        }
        //Mostramos los números que ingreso el usuario
        for (int numero: numeros) {
            System.out.print(numero + "-");
        }
    }
}
