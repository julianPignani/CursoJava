package Clase9;

import java.util.Scanner;

public class BuscadorPersonas {
    public static void main(String[] args) {
         //Crea un programa que tenga un arreglo con nombres completos de personas. Además, debe permitir realizar
        //una búsqueda por el nombre de la persona

        String [] personas = {"Julian Pignani", "Samuel Garcia" , "Juan Perez", "Matias Lopez"};

        String busqueda = getBusquedaPersona("Samuel");

        for (String nombrePersona : personas){
           if (nombrePersona.toLowerCase().contains(busqueda.toLowerCase())){
               System.out.println("La persona encontrada es: " + nombrePersona);
           }
       }
    }

    private static String getBusquedaPersona(String busqueda) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Comience su búsqueda: ");
        busqueda = teclado.nextLine();
        return busqueda;
    }
}
