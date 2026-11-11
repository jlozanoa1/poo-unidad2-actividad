package ejercicio1;

public class PruebaPersonas {
    public static void main(String[] args) {
        Persona[] personas = {
                new Persona("Juan"),
                new Estudiante("Laura", "Ingeniería de Sistemas"),
                new Profesor("Carlos", "Programación")
        };

        for (Persona p : personas) {
            p.presentarse();
        }
    }
}
