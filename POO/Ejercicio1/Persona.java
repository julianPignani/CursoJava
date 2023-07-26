package Ejercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Persona {


        private Integer id;
        private String nombre;
        private Integer edad;
        private LocalDate fechaNacimiento;
        private Integer dni;
        private static Integer ultimoId = 0;
    //Generamos el constructor
    public Persona(String nombre, Integer edad, String fechaNacimiento, Integer dni) {
        this.nombre = nombre;
        this.edad = edad;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, formatter);
        this.dni = dni;
        this.id = ++ultimoId;
    }
    //Generamos getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }
    //Metodo para mostrar datos
    public void mostrarDatos(){
        System.out.println("Id: " + id + ", Nombre: " + nombre + ", Fecha de nacimiento " + fechaNacimiento + ", Dni: " + dni);
    }
    //Metodo para saber si es mayor o menor de edad
    public void esMayorDeEdad(){
        if (edad >= 18){
            System.out.println(nombre +" es mayor de edad, tiene " + edad +" años" );
        }else {
            System.out.println(nombre +" es menor de edad, tiene " + edad +" años" );
        }

    }
}
