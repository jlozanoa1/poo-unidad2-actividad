package ejercicio2;

public class PruebaAnimales {
    public static void main(String[] args) {
        Animal a = new Animal("Perro");
        Pez p = new Pez("Salmón", "Dulce");

        a.mostrarEspecie();
        System.out.println("---");
        p.mostrarInfoPez();
    }
}
