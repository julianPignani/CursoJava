package Clase5;

import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner entrada = new  Scanner(System.in);
        int numeroAleatorio = random.nextInt(100) + 1;
        boolean adivinado = false;
        int intento = 0;

        while(!adivinado){
            System.out.println("Ingrese un número entre el 1 y 100: ");
            int numero = entrada.nextInt();
            intento++;

            if(numero == numeroAleatorio){
                System.out.println("Felicidades, Adivinaste el número en " + intento + " intentos");
                adivinado = true;
            } else if (numero > numeroAleatorio) {
                System.out.println("El número ingresado  es más grande, Intenta nuevamente");
            }else if (numero < numeroAleatorio){
                System.out.println("El número ingresado es más pequeño, Intenta nuevamente");
            }
        }

    }
}
