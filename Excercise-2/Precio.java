import java.util.ArrayList;

public class Precio {
    protected ArrayList<Producto> productos;

    public Precio() {
        productos = new ArrayList<>();
    }

    public void addProducto(Producto producto) {
        productos.add(producto);
    }

    public void getProductos() {
        for (Producto producto : productos) {
            producto.getProducto();
        }
    }

    public double getTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }
}
