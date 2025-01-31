public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Carlos", 25, 'F', 200, 1.75);
        Profesor profesor = new Profesor("Ana", 40, 'M', 65, 1.68, "Matemáticas");
        Estudiante estudiante = new Estudiante("Luis", 16, 'H', 60, 1.65, "Secundaria");

        System.out.println(persona1);
        System.out.println("------------------------");
        System.out.println(persona2);
        System.out.println("------------------------");
        System.out.println("IMC Persona: " + persona2.calcularIMC());
        System.out.println("------------------------");
        System.out.println("¿Es mayor de edad? " + persona2.esMayorDeEdad());
        System.out.println("------------------------");

        System.out.println(profesor);
        System.out.println(estudiante);
    }
}
