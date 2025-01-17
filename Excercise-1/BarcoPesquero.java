import java.util.Scanner;

public class BarcoPesquero extends Barco {
    private int capAlmacen;

    public BarcoPesquero(int tripulacion, String nombre, int capAlmacen) {
        super(tripulacion, nombre);
        this.capAlmacen = capAlmacen;
    }

    public void pescar() {
        System.out.println("Pescando...");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad pescada: ");
        int cantPescado = scanner.nextInt();
        scanner.nextLine();

        if(capAlmacen < cantPescado){
            System.out.println("No hay suficiente espacio en el almacen");
        }else{
            capAlmacen -= cantPescado;
            System.out.println( "Pescado almacenado, espacio disponible: " + capAlmacen );
        }
    }

    public void showBarcoPesquero() {
        super.showBarco();
        System.out.println(" y capacidad de almacen: " + capAlmacen);
    }

}