package CatalogoVentas;

public abstract class Producto implements IProducto{

    protected int precio;


    public Producto(int precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
