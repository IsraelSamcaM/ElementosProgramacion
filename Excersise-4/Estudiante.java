public class Estudiante extends Persona {
    private String grado;

    public Estudiante(String nombre, int edad, char sexo, double peso, double altura, String grado) {
        super(nombre, edad, sexo, peso, altura);
        this.grado = grado;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    @Override
    public String toString() {
        return super.toString() + ", Estudiante{" +
                "grado='" + grado + '\'' +
                '}';
    }
}
