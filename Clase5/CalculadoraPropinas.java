package Clase5;

import javax.swing.*;

public class CalculadoraPropinas {
    public static void main(String[] args) {

        double cuentaTotal  = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el total de la cuenta de un restaurante: "));

        double propina = Double.parseDouble(JOptionPane.showInputDialog("que porcentaje de la propina deseas dejar:"));

        double propinaRecibida = cuentaTotal * (propina / 100);

        JOptionPane.showMessageDialog(null,"El total de la propina recibida es : " + propinaRecibida);
    }
}
