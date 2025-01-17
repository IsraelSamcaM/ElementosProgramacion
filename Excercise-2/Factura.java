public class Factura extends Precio {
    private String emisor;
    private String cliente;
    private int numFactura;

    public Factura(String emisor, String cliente) {
        super(); 
        this.emisor = emisor;
        this.cliente = cliente;
        numFactura = 0; 
    }

    public void imprimirFactura() {
        System.out.println("Factura No. " + numFactura);
        System.out.println("Emisor: " + emisor);
        System.out.println("Cliente: " + cliente);
        System.out.println("\nProductos:");
        super.getProductos();
        System.out.println("Total: " + super.getTotal());
    }
}
