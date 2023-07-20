package Clase8;

public class GeneradorPassword {
    public static void main(String[] args) {
        //Crear una función que sea un generador de contraseñas. Al llamarla debe devolver una contraseña
        // (por ejemplo, puedes utilizar Math.random() para devolver un número aleatorio que podría ser una contraseña.

        System.out.println(generadorDepassword());

    }
    private static String generadorDepassword(){
        int numeroAleatorio = (int) (Math.random() * 10000);
        String password = "jdper";
        return password + numeroAleatorio;
    }
}
