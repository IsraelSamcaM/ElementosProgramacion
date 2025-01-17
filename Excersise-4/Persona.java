import java.util.Random;

public class Persona {
    private String nombre;
    private int edad;
    private String CI;
    private char sexo;
    private double peso;
    private double altura;

    private static final char SEXO_DEFECTO = 'H';
    private static final int PESO_IDEAL = 0;
    private static final int DEBAJO_PESO = -1;
    private static final int SOBREPESO = 1;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.CI = generarCI();
        this.sexo = SEXO_DEFECTO;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.CI = generarCI();
        this.sexo = comprobarSexo(sexo);
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.CI = generarCI();
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    private String generarCI() {
        Random random = new Random();
        return String.valueOf(1000000000 + random.nextInt(900000000));
    }

    private char comprobarSexo(char sexo) {
        return (sexo == 'H' || sexo == 'M') ? sexo : SEXO_DEFECTO;
    }

    public int calcularIMC() {
        double imc = (peso / (altura * altura));
        if (imc < 18.5) return DEBAJO_PESO;
        if ( 18.5<= imc && imc <= 24.9) return PESO_IDEAL;
        return SOBREPESO;
    }
   
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", CI='" + CI + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
