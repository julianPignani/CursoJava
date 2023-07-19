package Clase7;

import java.util.Scanner;

public class MayorMenor {
    public static void main(String[] args) {
        //Después de realizar el ejercicio anterior, agregar que muestre el número mayor y el número menor.
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];

        //Recorremos el array y lo completamos
        for (int i = 0; i < numeros.length; i++){
            System.out.print("Ingrese un número: ");
            numeros[i] = teclado.nextInt();
        }

        int mayor = 0;
        int menor = 0;
        for (int i = 0; i < numeros.length;i++) {
            System.out.print(numeros[i] + " ");

            if (numeros[i] < menor || i == 0){
                menor = numeros[i];
            }
            if (numeros[i] > mayor || i == 0){
                mayor = numeros[i];
            }
        }

        System.out.println("\nEl número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);


    }

}
