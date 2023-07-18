package Clase6;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijetas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Juguemos piedra-papel o tijeras!!");
        System.out.println("Elige su elección: piedra , papel o tijetas");
        
        String eleccionUsuario = teclado.nextLine();
        
        //Generamos la elección aleatoria de la computadora
        int eleccionComputadora = random.nextInt(3);
        
        //convertimos la elección de la computadora en una cadena de texto con un Switch segun la opcion que eliga
        String eleccionComputadoraStr = switch (eleccionComputadora) {
            case 0 -> "piedra";
            case 1 -> "papel";
            case 2 -> "tijeras";
            default -> "";
        };
        System.out.println("La elección de la maquina es: " + eleccionComputadoraStr);
        
        //Determinar Ganador!
        String resultado;
        if (eleccionUsuario.equals(eleccionComputadoraStr)){
            resultado = "Es un Empate!!";
        } else if ((eleccionUsuario.equals("piedra") && eleccionComputadoraStr.equals("tijeras")) ||
                (eleccionUsuario.equals("papel") && eleccionComputadoraStr.equals("piedra")) ||
                        (eleccionUsuario.equals("tijetas") && eleccionComputadoraStr.equals("papel"))){
                            resultado = "!!Ganaste!!";
            
        }else{
            resultado = "La computadora Ganó!!";
        }
        System.out.println(resultado);

    }
}
