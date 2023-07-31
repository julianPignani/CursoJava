package CatalogoVentas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Libro extends Producto implements IProducto,ILibro{

    private Date fechaPublicacion;
    private String autor;
    private String titulo;
    private String editorial;

    public Libro(int precio, String fechaPublicacion, String autor, String titulo, String editorial) throws ParseException {
        super(precio);
        SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
        this.fechaPublicacion = fecha.parse(fechaPublicacion);
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    @Override
    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getEditorial() {
        return editorial;
    }

    @Override
    public double gerPrecioVenta() {
        return getPrecio() * 0.95;
    }
}
