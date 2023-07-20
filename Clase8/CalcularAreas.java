package Clase8;

public class CalcularAreas {
    public static void main(String[] args) {

        //Hacer una función que calcule el área de un cuadrado. Al llamarla debe devolver el área del cuadrado
        double areaCuadrado = calcularAreaCuadrado(20,10);
        System.out.println("El área del cuadrado es: " +areaCuadrado);

        //Hacer una función que calcule el área de un triángulo. Al llamarla debe devolver el área del triángulo
        double areaTriangulo = calcularAreaTriangulo(20,10);
        System.out.println("El área del triangulo es: " + areaTriangulo);
    }
    //Creamos la función para calcular el área de un cuadrado
    private static double calcularAreaCuadrado(double altura, double ancho){
        return altura * ancho;
    }
    //Creamos la función para calcular el área de un triángulo
    private static double calcularAreaTriangulo(double altura, double base){
        return (base * altura) /2;
    }
}
