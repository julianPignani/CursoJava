package OrdenDeCompra;

import java.util.Date;

public class OrdenCompra {

    //Asignamos atributos
    private Integer id;
    private  static int ultimoId = 0;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto [] productos;
    private int cantidadProductos = 0;


    //generamos el constructor
    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
        this.id = ++ultimoId;
        this.productos = new Producto[4];
    }


    //getters
    public Integer getId() {
        return id;
    }

    public static Integer getUltimoId() {
        return ultimoId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProducto() {
        return productos;
    }
    // setters
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    //metodo para agregar productos
    public void addProducto (Producto producto){

        if (cantidadProductos < this.productos.length){
            this.productos[cantidadProductos++] = producto;
        }
    }
    //Metodo para que devuelva el total del precio
    public int getGranTotal(){
        int total = 0;
        for (Producto producto : productos) {
                total += producto.getPrecio();
            }
        return  total;
    }

}
