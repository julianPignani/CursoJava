package Clase6;

import java.util.Scanner;

public class MayorDeTres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa 3 números para determinar el mayor y el menor: ");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int num3 = teclado.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El número mayor es: " + num1);
        }else if (num2 > num1 && num2 > num3){
            System.out.println("El número mayor es: " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("El número mayor es: " + num3);

        }
    }
}
