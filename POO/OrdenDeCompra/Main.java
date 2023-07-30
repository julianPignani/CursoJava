package OrdenDeCompra;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //Instanciamos la orden de compra, le asignamos un cliente y la fecha, luego realizamos la orden.

        OrdenCompra orden1 = new OrdenCompra("Orden de compra de verduleria");
        orden1.setCliente(new Cliente("Julián" , "Pignani"));
        orden1.setFecha(new Date());
        orden1.addProducto(new Producto("Don tito", "Manzanas", 150));
        orden1.addProducto(new Producto("Don tito", "Bananas", 125));
        orden1.addProducto(new Producto("Don tito", "Duraznos", 350));
        orden1.addProducto(new Producto("Don tito", "Melones", 895));

        OrdenCompra orden2 = new OrdenCompra("Orden de compra de Shopping");
        orden2.setCliente(new Cliente("Julián" , "Pignani"));
        orden2.setFecha(new Date());
        orden2.addProducto(new Producto("Lacoste", "Remera", 22000));
        orden2.addProducto(new Producto("Zara", "Pantalón", 14999));
        orden2.addProducto(new Producto("Bandos", "Buzo", 45000));
        orden2.addProducto(new Producto("Heladeria", "Helado", 1500));

        OrdenCompra orden3 = new OrdenCompra("Orden de compra Supermercado");
        orden3.setCliente(new Cliente("Julián" , "Pignani"));
        orden3.setFecha(new Date());
        orden3.addProducto(new Producto("Sancor", "Leche", 453));
        orden3.addProducto(new Producto("La Paulina", "Queso", 2600));
        orden3.addProducto(new Producto("Paladini", "Paleta", 3500));
        orden3.addProducto(new Producto("Danica", "Manteca", 895));

        //Creamos un array de ordenesCompra para mostrarlas por consola
        OrdenCompra[] ordenes = {orden1, orden2, orden3};

        for (OrdenCompra orden: ordenes) {
            System.out.println("id: " + orden.getId());
            System.out.println("Cliente: " + orden.getCliente());
            System.out.println("Fecha: " + orden.getFecha());
            System.out.println("Descripción: " + orden.getDescripcion());
            System.out.println("Total: $" + orden.getGranTotal());

            int i = 1;
            for (Producto p : orden.getProducto()){
                System.out.println("Productos "  + i +  ":" + p.getNombre() + " " + p.getFabricante() + " precio $"
                        + p.getPrecio());
                i++;
            }
            System.out.println("--------------------------siguiente-----------------------------------------");
        }
    }
}
