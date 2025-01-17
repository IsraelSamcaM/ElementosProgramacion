public class Main {
    public static void main(String[] args) {
        BarcoFragata barcoFragata = new BarcoFragata(100, "Fragata", 1000.0, 10, 5);
        BarcoPesquero barcoPesquero = new BarcoPesquero(50, "Pesquero", 1000);

        barcoFragata.showBarco();
        System.out.println("--------------------------------------");
        barcoFragata.navegar();
        for(int i = 0; i<10 ; i++){
            barcoFragata.atacarEnemigo();
        }
        barcoFragata.showBarcoFragata();
        System.out.println("--------------------------------------");
        barcoPesquero.showBarco();
        barcoPesquero.navegar();
        barcoPesquero.pescar();
        barcoPesquero.showBarcoPesquero();
        System.out.println("--------------------------------------");
    }
}


