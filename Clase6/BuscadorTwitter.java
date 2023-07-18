package Clase6;

import java.util.Scanner;

public class BuscadorTwitter {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese una palabra o celebridad que deseas buscar");
        String palabraBuscar = teclado.nextLine();

        System.out.println("Link " + "https://twitter.com/search?q=" + palabraBuscar);

    }
}
