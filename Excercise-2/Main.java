public class Main {
    public static void main(String[] args) {
        Producto refresco = new Producto("Refresco", 10.50);
        Producto pizza = new Producto("Porción de pizza", 20.00);
        Producto helado = new Producto("Helado", 30.50);
        Producto bife = new Producto("Bife", 40.00);

        Factura factura = new Factura("Pensión Pepe", "José Israel Samca Montaño");
        factura.addProducto(refresco);
        factura.addProducto(pizza);
        factura.addProducto(helado);
        factura.addProducto(bife);

        factura.imprimirFactura();
    }
}
