package Clase6;

import java.util.Scanner;

public class CuentoDinamico {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("¡¡Bienvenido al cuento dinámico!!");
        System.out.println("Selecciona un personaje para comenzar el cuento: ");
        System.out.println("1. Princesa");
        System.out.println("2. Caballero");
        System.out.println("3. Dragón");

        int opcion = teclado.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Habia una vez una valiente princesa.....");
                break;
            case 2:
                System.out.println("Habia una vez un valiente caballero....");
                break;
            case 3:
                System.out.println("Un dragón muy peligroso vivia en un castillo....");
                break;
            default:
                System.out.println("Las opción ingresada no es correcta.");

        }
    }
}
