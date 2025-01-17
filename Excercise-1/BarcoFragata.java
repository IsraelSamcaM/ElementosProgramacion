public class BarcoFragata extends Barco{
    private double alcance;
    private int cantMuniciones;
    private int cantCanones;

    public BarcoFragata(int tripulacion, String nombre, double alcance, int cantMuniciones, int cantCanones){
        super(tripulacion, nombre);
        this.alcance = alcance;
        this.cantMuniciones = cantMuniciones;
        this.cantCanones = cantCanones;
    }

    public void atacarEnemigo(){
        System.out.println("Atacando al enemigo...");
        if(cantMuniciones > 0){
            cantMuniciones--;
            System.out.println("Municion disparada, municiones restantes: " + cantMuniciones);
        }else{
            System.out.println("No hay municiones disponibles");
        }
    }

    public void showBarcoFragata(){
        super.showBarco();
        System.out.println(" con alcance: " + alcance + 
        "\nCantidad de municiones: " + cantMuniciones + 
        "\nCantidad de cañones: " + cantCanones);
    }

}