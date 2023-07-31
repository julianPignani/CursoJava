package CatalogoVentas;


import java.text.ParseException;

public class ProyectoCatalogo {
    public static void main(String[] args) throws ParseException {

        IProducto[] productos = new Producto[6];
        productos[0]= new IPhone(140000,"APPLE","Azul", "IPhone 13 plus");
        productos[1]= new Libro(2000,"25/05/2000","Julián Pignani", "El Villano","FG8457GI");
        productos[2]= new TvLcd(55000,"Noblex", 65);
        productos[3]= new TvLcd(45000,"Sony" , 45);

        for (IProducto producto : productos){
            System.out.println("Caracteristica de la venta ");
            System.out.println("-");
            System.out.println("Precio " + producto.gerPrecioVenta());

            // Para los Electronicos  ============
            if (producto instanceof IElectronico) {
                System.out.print(" - ");
                System.out.print("Fabricante: " + ((IElectronico) producto).getFabricante());

                // Para los IPhone ============
                if (producto instanceof IPhone) {
                    System.out.print(" - ");
                    System.out.print("Modelo: " + ((IPhone) producto).getModelo());
                    System.out.print(" - ");
                    System.out.print("Color: " + ((IPhone) producto).getColor());
                }

                // Para los LCD  ============
                if (producto instanceof TvLcd) {
                    System.out.print(" - ");
                    System.out.print("Pulgadas: " + ((TvLcd) producto).getPulgada());
                }
            }

            // Para los Libros  ============
            if (producto instanceof ILibro) {
                System.out.print(" - ");
                System.out.print("Titulo: " + ((ILibro) producto).getTitulo());
                System.out.print(" - ");
                System.out.print("Autor: " + ((ILibro) producto).getAutor());

            }

            System.out.println();
        }
    }
 }

