package Clase7;

import java.util.Scanner;

public class sumaArrays {
    public static void main(String[] args) {
        /*Hay que mostrar el promedio. Para hacer esto se suman todos
        los números y se divide por 5, ya que el usuario agregó 5 números.*/
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];
        int sumaTotal = 0;

        for (int i =0; i < numeros.length; i++){
            System.out.print("Ingresa un número: ");
            numeros[i] = teclado.nextInt();
            sumaTotal += numeros[i];
        }
        float promedio =(float) sumaTotal / numeros.length;
        System.out.println("El promedio de los números ingresados es: " + promedio);
    }
}
