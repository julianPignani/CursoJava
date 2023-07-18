package Clase6;

import java.util.Scanner;

public class BuscadorPaises {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el pais que deseas buscar a través de Google Maps: ");
        String pais = teclado.nextLine();

        System.out.println("Link " + "https://www.google.com/maps/search/" + pais);
    }
}
