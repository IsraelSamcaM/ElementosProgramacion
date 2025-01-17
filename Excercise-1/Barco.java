public class Barco {
    protected int tripulacion;
    protected String nombre;

    public Barco(int tripulacion, String nombre) {
        this.tripulacion = tripulacion;
        this.nombre = nombre;
    }

    public void navegar() {
        System.out.println("Navegando...");
    }

    public void showBarco() {
        System.out.println("Barco: " + nombre + " con tripulacion: " + tripulacion);
    }
}