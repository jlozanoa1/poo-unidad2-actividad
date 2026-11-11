package ejercicio1;

public class PruebaPersonas {
    public static void main(String[] args) {
        Persona p = new Persona("Juan", 40);
        Empleado e = new Empleado("Ana", 30, "Contabilidad");

        System.out.println("--- Persona ---");
        p.mostrarDetalles();
        System.out.println("--- Empleado ---");
        e.mostrarDetalles();
    }
}
