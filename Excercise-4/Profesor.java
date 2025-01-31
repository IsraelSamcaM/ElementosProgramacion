public class Profesor extends Persona {
    private String asignatura;

    public Profesor(String nombre, int edad, char sexo, double peso, double altura, String asignatura) {
        super(nombre, edad, sexo, peso, altura);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return super.toString() + ", Profesor{" +
                "asignatura='" + asignatura + '\'' +
                '}';
    }
}
